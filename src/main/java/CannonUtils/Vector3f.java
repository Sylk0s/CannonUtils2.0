package CannonUtils;

// Not sure if this ever gets used
public final class Vector3f {
    private float x;
    private float y;
    private float z;

    // Constructors
    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3f(Vec3d other) {
        this((float)other.x, (float)other.y, (float)other.z);
    }

    // Get
    public float getX() {
        return this.x;
    }
  
    public float getY() {
        return this.y;
    }
  
    public float getZ() {
        return this.z;
    }
}