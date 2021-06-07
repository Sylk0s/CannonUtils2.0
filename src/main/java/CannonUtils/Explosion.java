package Explosion;

import CannonUtils.Vec3d;
import CannonUtils.MathHelper;

public final class Explosion {
    public Vec3d pos;
    public float power;

    // Constructors
    public Explosion(Vec3d pos, int power) {
        this.pos = pos;
        this.power = power;
    }

    public Explosion(double x, double y, double z, int power) {
        this.pos = new Vec3d(x, y, z);
        this.power = power;
    }

    public Vec3d getVelocity(Vec3d pos, Vec3d eyePos, float exposure, boolean tnt) {
        float range = this.power * 2.0F;
        // Distance from explosion to entity feet
        double distanceNormalized = (double)(MathHelper.sqrt(pos.squaredDistanceTo(this.pos)) / range);
        if (y <= 1.0D) {
            // Get the direction
            double dx = pos.x - this.pos.x;
            // There is an exception for tnt entities, the direction of velocity is explosion to feet instead of explosion to eyes (for some reason lol)
            double dy = (tnt ? pos.y : eyePos.y) - this.pos.y;
            double dz = pos.z - this.pos.z;
            double dmag = (double) MathHelper.sqrt(dx * dx + dy * dy + dz * dz);
            if (dmag != 0.0D) {
                // Normalize direction vector
                dx /= dmag;
                dy /= dmag;
                dz /= dmag;
                // Velocity magnitude is (1 - distance/2power) * exposure
                double velocityMag = (1.0D - distanceNormalized) * (double) exposure;
                return new Vec3d(dx * velocityMag, dy * velocityMag, dz * velocityMag);
            }
        }
    }
}