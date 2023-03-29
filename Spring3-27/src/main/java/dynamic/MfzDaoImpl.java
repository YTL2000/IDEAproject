package dynamic;

/**
 * @version 1.0
 * @auther YTL
 * @className MfzDaoImpl
 * since 1.0
 */
public class MfzDaoImpl implements MfzDao{
    @Override
    public void mfz() {
        System.out.println("卖房子");
    }

    @Override
    public int fz() {
        System.out.println("这是房租");
        return 1500;
    }
}
