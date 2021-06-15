package CannonUtils;

public class TntEntity extends Entity{
    TntEntity(Vec3d pos, Vec3d vel) {
        super(pos, vel, (double) 0.98F * 0.0625D, 0.49D, 0.49D, 0.49D);
    }
}
