package cn.allay.server.entity.type;

import cn.allay.api.component.interfaces.Component;
import cn.allay.api.component.interfaces.ComponentInitInfo;
import cn.allay.api.component.interfaces.ComponentProvider;
import cn.allay.api.data.VanillaEntityId;
import cn.allay.api.entity.Entity;
import cn.allay.api.entity.component.EntityComponent;
import cn.allay.api.entity.component.base.EntityBaseComponentImpl;
import cn.allay.api.entity.type.EntityInitInfo;
import cn.allay.api.entity.type.EntityType;
import cn.allay.api.entity.type.EntityTypeBuilder;
import cn.allay.api.entity.type.EntityTypeRegistry;
import cn.allay.api.identifier.Identifier;
import cn.allay.server.block.type.BlockTypeBuildException;
import cn.allay.server.component.injector.AllayComponentInjector;
import cn.allay.server.utils.ComponentClassCacheUtils;
import lombok.SneakyThrows;
import org.joml.primitives.AABBf;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Allay Project 2023/5/20
 *
 * @author daoge_cmd
 */
public class AllayEntityType<T extends Entity> implements EntityType<T> {
    protected Class<T> interfaceClass;
    protected Class<T> injectedClass;
    protected Constructor<T> constructor;
    protected List<ComponentProvider<? extends EntityComponent>> componentProviders;
    protected Identifier identifier;

    @SneakyThrows
    protected AllayEntityType(Class<T> interfaceClass,
                              List<ComponentProvider<? extends EntityComponent>> componentProviders,
                              Identifier identifier) {
        this.interfaceClass = interfaceClass;
        this.componentProviders = componentProviders;
        this.identifier = identifier;
        try {
            ArrayList<ComponentProvider<? extends Component>> components = new ArrayList<>(componentProviders);
            injectedClass = new AllayComponentInjector<T>()
                    .interfaceClass(interfaceClass)
                    .component(components)
                    .useCachedClass(ComponentClassCacheUtils.loadEntityType(interfaceClass))
                    .inject(true);
        } catch (Exception e) {
            throw new EntityTypeBuildException("Failed to create entity type!", e);
        }
        //Cache constructor
        constructor = injectedClass.getConstructor(ComponentInitInfo.class);
    }
    @Override
    public List<ComponentProvider<? extends EntityComponent>> getComponentProviders() {
        return componentProviders;
    }

    @SneakyThrows
    @Override
    public T createEntity(EntityInitInfo<T> info) {
        info.setEntityType(this);
        return constructor.newInstance(info);
    }

    @Override
    public Identifier getIdentifier() {
        return identifier;
    }

    public static <T extends Entity> EntityTypeBuilder<T> builder(Class<T> interfaceClass) {
        return new Builder<>(interfaceClass);
    }

    public static class Builder<T extends Entity> implements EntityTypeBuilder<T> {
        protected Class<T> interfaceClass;
        protected Map<Identifier, ComponentProvider<? extends EntityComponent>> componentProviders = new HashMap<>();
        protected Identifier identifier;

        public Builder(Class<T> interfaceClass) {
            this.interfaceClass = interfaceClass;
        }

        @Override
        public EntityTypeBuilder<T> namespace(Identifier identifier) {
            this.identifier = identifier;
            return this;
        }

        @Override
        public EntityTypeBuilder<T> namespace(String identifier) {
            this.identifier = new Identifier(identifier);
            return this;
        }

        @Override
        public EntityTypeBuilder<T> vanillaEntity(VanillaEntityId vanillaEntityId) {
            this.identifier = vanillaEntityId.getIdentifier();
            return this;
        }

        @Override
        public EntityTypeBuilder<T> setComponents(Map<Identifier, ComponentProvider<? extends EntityComponent>> componentProviders) {
            if (componentProviders == null)
                throw new BlockTypeBuildException("Component providers cannot be null");
            this.componentProviders = new HashMap<>(componentProviders);
            return this;
        }

        @Override
        public EntityTypeBuilder<T> addComponents(Map<Identifier, ComponentProvider<? extends EntityComponent>> componentProviders) {
            this.componentProviders.putAll(componentProviders);
            return this;
        }

        @Override
        public EntityTypeBuilder<T> addComponent(ComponentProvider<? extends EntityComponent> componentProvider) {
            this.componentProviders.put(componentProvider.findComponentIdentifier(), componentProvider);
            return this;
        }

        @Override
        public EntityType<T> build() {
            if (!componentProviders.containsKey(EntityBaseComponentImpl.IDENTIFIER))
                addComponent(ComponentProvider.of(
                        info -> new EntityBaseComponentImpl<>(
                                (EntityInitInfo<T>) info,
                                e -> new AABBf(0, 0, 0, 0, 0, 0)),
                        EntityBaseComponentImpl.class
                ));
            if (identifier == null)
                throw new EntityTypeBuildException("identifier cannot be null!");
            var type = new AllayEntityType<>(interfaceClass, new ArrayList<>(componentProviders.values()), identifier);
            EntityTypeRegistry.getRegistry().register(identifier, type);
            return type;
        }
    }
}
