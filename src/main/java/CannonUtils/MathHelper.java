package MathHelper;

// Mojank's strange math class, important because they do a bunch of casting that produces float errors
public final class MathHelper {
    public static float sqrt(double d) {
        return (float) Math.sqrt(d);
    }
}