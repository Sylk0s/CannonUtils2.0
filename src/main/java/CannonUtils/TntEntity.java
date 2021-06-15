package CannonUtils;

public class TntEntity extends Entity {
    TntEntity(Vec3d pos, Vec3d vel) {
        super(pos, vel, (double) 0.98F * 0.0625D, 0.49D, 0.49D, 0.49D);
    }
    
    public void tick() {
        this.vel = this.vel.add(0D, -0.04D, 0.0D);
        this.pos = this.pos.add(this.vel);
        this.vel = this.vel.multiply(0.98D);
    }
}
