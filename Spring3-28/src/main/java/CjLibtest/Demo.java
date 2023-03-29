package CjLibtest;

/**
 * @version 1.0
 * @auther YTL
 * @className Demo
 * since 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Horse horse = new HorseImpl();
        CglibProxy cglibProxy=new CglibProxy(horse);
        Horse proxy = (Horse)cglibProxy.createProxy();
        proxy.rent();
    }
}
