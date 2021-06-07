package CannonUtils;

public class Entity {
    public Vec3d pos;
    public Vec3d vel;
    public final double eyeHeight;

    public double minX, maxX, minY, maxY, minZ, maxZ;

    Entity(Vec3d pos, Vec3d vel, double eyeHeight, double radiusX, double radiusY, double radiusZ){
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
}
