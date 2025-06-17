package sew.skateboard.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.HorseEntity;
import net.minecraft.world.World;

public class SkateboardEntity extends HorseEntity {

    public SkateboardEntity(EntityType<? extends HorseEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        // Leave empty to prevent default horse behaviors
    }

    public static DefaultAttributeContainer.Builder createSkateboardAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 15)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1f)
                .add(EntityAttributes.HORSE_JUMP_STRENGTH, 1f)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 0f)
                .add(EntityAttributes.GENERIC_LUCK, 1024)
                .add(EntityAttributes.GENERIC_ARMOR, 30);
    }

    @Override
    public boolean isSaddled() {
        return true; // Always allow riding without saddle
    }

    @Override
    protected boolean receiveFood(net.minecraft.entity.player.PlayerEntity player, net.minecraft.item.ItemStack item) {
        return false; // Prevent feeding
    }

    @Override
    public boolean isBreedingItem(net.minecraft.item.ItemStack stack) {
        return false; // Prevent breeding
    }
}