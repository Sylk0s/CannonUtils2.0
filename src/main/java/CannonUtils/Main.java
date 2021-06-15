package CannonUtils;

// import java.io.*;

public class Main {
    public static void main(String[] args) {
        Explosion explosion = new Explosion(0, 0.061250001192093, 0, 4.0F);
        TntEntity tntEntity = new TntEntity(new Vec3d(1F/16F, 0.06125017384653848, 0), new Vec3d(0, 0, 0));
        System.out.println(explosion.getVelocity(tntEntity, 1.0F));
        float x = 0.98F;
        System.out.println((double)x*0.0625D);
        System.out.println((double)0.25F*0.85D);
        // System.out.println(7.96F/(double) MathHelper.sqrt(7.96D*7.96D));
        // System.out.println((double) MathHelper.sqrt((7.96D - 0.061250001192093D)*(7.96D - 0.061250001192093D))/8.0F);
        // System.out.println(explosion.getVelocity(new Vec3d(4, 0, 0), 0.061250001192093, 1F, true).toString());
    }
}
