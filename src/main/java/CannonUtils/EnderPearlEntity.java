package CannonUtils;

public class EnderPearlEntity extends Entity {
    EnderPearlEntity(Vec3d pos, Vec3d vel) {
        super(pos, vel, (double) 0.85F * 0.25D, 0.125D, 0.125D, 0.125D);
    }

    public void tick() {
        this.pos = this.pos.add(this.vel);
        this.vel = this.vel.multiply((double)0.99F);
        this.vel = this.vel.add(0D, -(double) 0.03F, 0.0D);
    }
}
