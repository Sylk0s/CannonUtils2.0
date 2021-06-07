package CannonUtils;

public final class Vec3d {
    public final double x;
    public final double y;
    public final double z;

    // Constructors
    public Vec3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vec3d(Vector3f vec) {
        this((double)vec.getX(), (double)vec.getY(), (double)vec.getZ());
    }

    // Get
    public final double getX() {
        return this.x;
    }
  
    public final double getY() {
        return this.y;
    }
  
    public final double getZ() {
        return this.z;
    }

    // Addition, Subtraction, Multiplication
    public Vec3d add(Vec3d vec) {
        return this.add(vec.x, vec.y, vec.z);
    }

    public Vec3d add(double x, double y, double z) {
        return new Vec3d(this.x + x, this.y + y, this.z + z);
    }

    public Vec3d subtract(Vec3d vec) {
        return this.subtract(vec.x, vec.y, vec.z);
    }

    public Vec3d subtract(double x, double y, double z) {
        return this.add(-x, -y, -z);
    }
  
    public Vec3d multiply(double mult) {
        return this.multiply(mult, mult, mult);
    }

    public Vec3d multiply(Vec3d mult) {
        return this.multiply(mult.x, mult.y, mult.z);
    }

    public Vec3d multiply(double multX, double multY, double multZ) {
        return new Vec3d(this.x * multX, this.y * multY, this.z * multZ);
    }

    // Distance & Length
    public double distanceTo(Vec3d vec) {
        double d = vec.x - this.x;
        double e = vec.y - this.y;
        double f = vec.z - this.z;
        return (double)MathHelper.sqrt(d * d + e * e + f * f);
    }
  
    public double squaredDistanceTo(Vec3d vec) {
        double d = vec.x - this.x;
        double e = vec.y - this.y;
        double f = vec.z - this.z;
        return d * d + e * e + f * f;
    }
  
    public double squaredDistanceTo(double x, double y, double z) {
        double d = x - this.x;
        double e = y - this.y;
        double f = z - this.z;
        return d * d + e * e + f * f;
    }

    public double length() {
        return (double)MathHelper.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
  
    public double lengthSquared() {
        return this.x * this.x + this.y * this.y + this.z * this.z;
    }
}