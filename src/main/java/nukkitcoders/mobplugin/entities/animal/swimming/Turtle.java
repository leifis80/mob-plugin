package nukkitcoders.mobplugin.entities.animal.swimming;

import cn.nukkit.entity.Entity;
import cn.nukkit.entity.EntityCreature;
import cn.nukkit.item.Item;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;
import nukkitcoders.mobplugin.entities.animal.SwimmingAnimal;
import nukkitcoders.mobplugin.utils.Utils;

public class Turtle extends SwimmingAnimal {

    public static final int NETWORK_ID = 74;

    public Turtle(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    @Override
    public int getNetworkId() {
        return NETWORK_ID;
    }

    @Override
    public float getWidth() {
        return 1.2f;
    }

    @Override
    public float getHeight() {
        return 0.4f;
    }

    @Override
    public void initEntity() {
        super.initEntity();
        this.setMaxHealth(30);
    }

    @Override
    public boolean targetOption(EntityCreature creature, double distance) {
        return false;
    }

    @Override
    public Item[] getDrops() {
        return new Item[0];
    }

    @Override
    public int getKillExperience() {
        return Utils.rand(1, 4);
    }
    
    @Override
    public boolean isBaby() {
        return this.getDataFlag(DATA_FLAGS, Entity.DATA_FLAG_BABY);
    }
}
