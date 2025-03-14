package org.allaymc.server.network.processor.impl.login;

import org.allaymc.api.entity.interfaces.EntityPlayer;
import org.allaymc.api.i18n.TrKeys;
import org.allaymc.api.registry.Registries;
import org.allaymc.server.entity.component.player.EntityPlayerNetworkComponentImpl;
import org.allaymc.server.entity.impl.EntityPlayerImpl;
import org.allaymc.server.network.DeferredData;
import org.allaymc.server.network.processor.impl.ingame.ILoginPacketProcessor;
import org.cloudburstmc.protocol.bedrock.packet.BedrockPacketType;
import org.cloudburstmc.protocol.bedrock.packet.ResourcePackClientResponsePacket;

import java.util.UUID;

/**
 * @author daoge_cmd
 */
public class ResourcePackClientResponsePacketProcessor extends ILoginPacketProcessor<ResourcePackClientResponsePacket> {
    @Override
    public void handle(EntityPlayer player, ResourcePackClientResponsePacket packet) {
        switch (packet.getStatus()) {
            case SEND_PACKS -> {
                for (var packId : packet.getPackIds()) {
                    var pack = Registries.PACKS.get(UUID.fromString(packId.split("_")[0]));
                    if (pack == null) {
                        player.disconnect(TrKeys.M_DISCONNECTIONSCREEN_RESOURCEPACK);
                        return;
                    }

                    player.sendPacket(pack.toNetwork());
                }
            }
            case HAVE_ALL_PACKS -> player.sendPacket(DeferredData.RESOURCES_PACK_STACK_PACKET.get());
            case COMPLETED ->
                    ((EntityPlayerNetworkComponentImpl) ((EntityPlayerImpl) player).getPlayerNetworkComponent()).initializePlayer();
            default -> player.disconnect(TrKeys.M_DISCONNECTIONSCREEN_NOREASON);
        }
    }

    @Override
    public BedrockPacketType getPacketType() {
        return BedrockPacketType.RESOURCE_PACK_CLIENT_RESPONSE;
    }
}
