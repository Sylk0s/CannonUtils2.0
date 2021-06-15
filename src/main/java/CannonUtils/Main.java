package CannonUtils;

// import java.io.*;

public class Main {
    public static void main(String[] args) {
        Explosion explosion = new Explosion(0, 1.061250001192092896, 0, 4.0F);
        TntEntity tntEntity = new TntEntity(new Vec3d(1F/16F, 1.061250001192093, 0), new Vec3d(0, 0, 0));
        EnderPearlEntity enderPearlEntity = new EnderPearlEntity(new Vec3d(1F/16F, 0.848749995231628396, 0), new Vec3d(0, 0, 0));
        System.out.println(explosion.getVelocity(tntEntity, 1.0F));
        System.out.println(explosion.getVelocity(enderPearlEntity, 1.0F));
    }
}
