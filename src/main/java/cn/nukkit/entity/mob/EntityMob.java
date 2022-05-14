package cn.nukkit.entity.mob;

import cn.nukkit.api.PowerNukkitXOnly;
import cn.nukkit.entity.EntityPhysical;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

/**
 * @author MagicDroidX (Nukkit Project)
 */
public abstract class EntityMob extends EntityPhysical {
    public EntityMob(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    @PowerNukkitXOnly
    public boolean isUnderStrongLight(){
        int x = this.getFloorX();
        int y = this.getFloorY();
        int z = this.getFloorZ();
        int skyLight = this.getLevel().getBlockSkyLightAt(x, y, z);
        return skyLight != 14;
    }
}
