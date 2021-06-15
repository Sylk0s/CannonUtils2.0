package CannonUtils;

public class Entity {
    public Vec3d pos;
    public Vec3d vel;
    public final double eyeHeight;

    public double minX, maxX, minY, maxY, minZ, maxZ;

    Entity(Vec3d pos, Vec3d vel, double eyeHeight, double radiusX, double radiusY, double radiusZ) {
        this.pos = pos;
        this.vel = vel;
        this.eyeHeight = eyeHeight;
        this.minX = -radiusX;
        this.maxX = radiusX;
        this.minY = -radiusY;
        this.maxY = radiusY;
        this.minZ = -radiusZ;
        this.maxZ = radiusZ;
    }

    public final void setVelocity(Vec3d vel) {
        this.vel = vel;
    }

    public interface Handler {
        Vec3d[] tickArgument (Vec3d pos, Vec3d vel);
    }

    public void tick() {};

    public void tick(int t) {
        for(int i = 0; i < t; i++)
            this.tick();
    }

    public Vec3d[][] tick(int t, Handler function) {
        Vec3d[][] result = new Vec3d[t][2];
        for(int i = 0; i < t; i++) {
            this.tick();
            result[i] = function.tickArgument(this.pos, this.vel);
        }
        return result;
    }
}
