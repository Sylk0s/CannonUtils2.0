public final class Vec3d {
    public final double x;
    public final double y;
    public final double z;

    public Vec3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vec3d(Vector3f vec) {
        this((double)vec.getX(), (double)vec.getY(), (double)vec.getZ());
    }
}