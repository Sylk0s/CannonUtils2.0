package CannonUtils;

// import java.io.*;

public class Main {
    public static void main(String[] args) {
        Explosion explosion = new Explosion(0, 1.061250001192092896, 0, 4.0F);
        TntEntity tntEntity = new TntEntity(new Vec3d(1F/16F, 1.061250001192093, 0), new Vec3d(0, 0, 0));
        EnderPearlEntity enderPearlEntity = new EnderPearlEntity(new Vec3d(1F/16F, 0.848749995231628396, 0), new Vec3d(0, 0, 0));
        System.out.println(explosion.getVelocity(tntEntity, 1.0F));
        System.out.println(explosion.getVelocity(enderPearlEntity, 1.0F));
        enderPearlEntity.setVelocity(explosion.getVelocity(enderPearlEntity, 1.0F));
        enderPearlEntity.tick(10,new Entity.Handler(){
            public Vec3d[] tickArgument(Vec3d pos, Vec3d vel) {
                System.out.println(pos + ", " + vel);
                Vec3d[] result = {pos,vel};
                return result;
            }
        });
        enderPearlEntity = new EnderPearlEntity(new Vec3d(0D, 10D, 0D), new Vec3d(0D, 0D, 0D));
        enderPearlEntity.tick(10, new Entity.Handler() {
            public Vec3d[] tickArgument(Vec3d pos, Vec3d vel) {
                System.out.println(pos);
                Vec3d[] result = {pos,vel};
                return result;
            }
        });
        tntEntity = new TntEntity(new Vec3d(0D, 10D, 0D), new Vec3d(0D, 0D, 0D));
        tntEntity.tick(10, new Entity.Handler() {
            public Vec3d[] tickArgument(Vec3d pos, Vec3d vel) {
                System.out.println(pos);
                Vec3d[] result = {pos,vel};
                return result;
            }
        });
    }
}
