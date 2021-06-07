public final class Vector3f {
    private float x;
    private float y;
    private float z;

    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3f(Vec3d other) {
        this((float)other.x, (float)other.y, (float)other.z);
    }
}