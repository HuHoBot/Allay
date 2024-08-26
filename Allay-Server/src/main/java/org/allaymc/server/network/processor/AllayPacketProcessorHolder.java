package org.allaymc.server.network.processor;

import org.allaymc.api.network.processor.PacketProcessor;
import org.allaymc.api.network.processor.PacketProcessorHolder;
import org.allaymc.server.network.processor.login.*;
import org.cloudburstmc.protocol.bedrock.packet.BedrockPacket;
import org.cloudburstmc.protocol.bedrock.packet.BedrockPacketType;

import java.util.EnumMap;

/**
 * Allay Project 11/22/2023
 *
 * @author Cool_Loong
 */
public class AllayPacketProcessorHolder implements PacketProcessorHolder {

    private final EnumMap<BedrockPacketType, PacketProcessor<BedrockPacket>> processors = new EnumMap<>(BedrockPacketType.class);

    public AllayPacketProcessorHolder() {
        registerDefaultPacketProcessors(this);
    }

    protected void registerDefaultPacketProcessors(AllayPacketProcessorHolder holder) {
        // Login packet processors
        holder.registerProcessor(new RequestNetworkSettingsPacketProcessor());
        holder.registerProcessor(new LoginPacketProcessor());
        holder.registerProcessor(new ClientToServerHandshakePacketProcessor());
        holder.registerProcessor(new ResourcePackClientResponsePacketProcessor());
        holder.registerProcessor(new SetLocalPlayerAsInitializedPacketProcessor());
        holder.registerProcessor(new ResourcePackChunkRequestPacketProcessor());

        // Common packet processors
        holder.registerProcessor(new AnimatePacketProcessor());
        holder.registerProcessor(new BlockPickRequestPacketProcessor());
        holder.registerProcessor(new CommandRequestPacketProcessor());
        holder.registerProcessor(new ContainerClosePacketProcessor());
        holder.registerProcessor(new InteractPacketProcessor());
        holder.registerProcessor(new InventoryTransactionPacketProcessor());
        holder.registerProcessor(new ItemStackRequestPacketProcessor());
        holder.registerProcessor(new MobEquipmentPacketProcessor());
        holder.registerProcessor(new PlayerActionPacketProcessor());
        holder.registerProcessor(new PlayerAuthInputPacketProcessor());
        holder.registerProcessor(new RequestChunkRadiusPacketProcessor());
        holder.registerProcessor(new RespawnPacketProcessor());
        holder.registerProcessor(new SetDefaultGameTypePacketProcessor());
        holder.registerProcessor(new SetPlayerGameTypePacketProcessor());
        holder.registerProcessor(new SubChunkRequestPacketProcessor());
        holder.registerProcessor(new TextPacketProcessor());
        holder.registerProcessor(new SettingsCommandPacketProcessor());
        holder.registerProcessor(new ModalFormResponsePacketProcessor());
        holder.registerProcessor(new ServerSettingsRequestProcessor());
        holder.registerProcessor(new PlayerSkinPacketProcessor());
        holder.registerProcessor(new LevelSoundEvent2PacketProcessor());
        holder.registerProcessor(new EntityEventPacketProcessor());
        holder.registerProcessor(new BlockEntityDataPacketProcessor());
        holder.registerProcessor(new EmotePacketProcessor());
    }

    public PacketProcessor<BedrockPacket> getProcessor(BedrockPacket packet) {
        return processors.get(packet.getPacketType());
    }

    @SuppressWarnings("unchecked")
    public void registerProcessor(PacketProcessor<? extends BedrockPacket> processor) {
        processors.put(processor.getPacketType(), (PacketProcessor<BedrockPacket>) processor);
    }
}
