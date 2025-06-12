package sew.skateboard.entity.custom;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.HorseBaseEntity;
import net.minecraft.world.EntityView;
import net.minecraft.world.World;

public class SkateboardEntity extends HorseBaseEntity {

    public SkateboardEntity(EntityType<? extends HorseBaseEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {


    }

    public static DefaultAttributeContainer.Builder createSkateboardAttributes(){
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 15)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1f)
                .add(EntityAttributes.HORSE_JUMP_STRENGTH, 1f)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 0f)
                .add(EntityAttributes.GENERIC_LUCK, 1024)
                .add(EntityAttributes.GENERIC_ARMOR, 30);
    }

    @Override
    public EntityView method_48926() {
        return null;
    }

//    @Nullable
//    @Override
//    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity){
//        return ModEntities.SKATEBOARD.create(world);
//    }

//    private static final double SPEED_MULTIPLIER = 0.4;
//    private static final double JUMP_STRENGTH = 0.5;
//    private boolean isJumping = false;
//    public SkateboardEntity(EntityType<?> type, World world) {
//        super(type, world);
//    }
//    @Override
//    public ActionResult interact(PlayerEntity player, Hand hand) {
//        if (!this.hasPassengers()) {
//            player.startRiding(this);
//            return ActionResult.SUCCESS;
//        }
//        return ActionResult.PASS;
//    }
//    @Override
//    public void tick() {
//        super.tick();
//
//        if (this.hasPassengers()) {
//            Entity rider = this.getFirstPassenger();
//
//            if (rider instanceof PlayerEntity player) {
//                // Get player input
//                float forward = player.forwardSpeed;
//                float sideways = player.sidewaysSpeed;
//
//                // Calculate movement based on player's looking direction and input
//                float yaw = player.getYaw();
//                double x = (double)(MathHelper.sin(-yaw * 0.017453292F) * forward + MathHelper.cos(yaw * 0.017453292F) * sideways) * SPEED_MULTIPLIER;
//                double z = (double)(MathHelper.cos(-yaw * 0.017453292F) * forward - MathHelper.sin(yaw * 0.017453292F) * sideways) * SPEED_MULTIPLIER;
//
//                this.setVelocity(x, this.getVelocity().y, z);
//
//                if (isJumping && this.isOnGround()) {
//                    this.addVelocity(0, JUMP_STRENGTH, 0);
//                    isJumping = false;
//                }
//            }
//        }
//
//        this.move(MovementType.SELF, this.getVelocity());
//
//        // Apply friction
//        this.setVelocity(this.getVelocity().multiply(0.9, 0.98, 0.9));
//    }
//    public void setJumping(boolean jumping) {
//        this.isJumping = jumping;
//    }
//    @Override
//    protected void initDataTracker() {}
//    @Override
//    protected void readCustomDataFromNbt(net.minecraft.nbt.NbtCompound nbt) {}
//    @Override
//    protected void writeCustomDataToNbt(net.minecraft.nbt.NbtCompound nbt) {}

}