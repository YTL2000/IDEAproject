package StaticAgent;

/**
 * @version 1.0
 * @auther YTL
 * @className zhongjie
 * since 1.0
 */
public class zhongjie implements MfzDao{
    private Fz fz;

    public zhongjie(Fz fz) {
        this.fz = fz;
    }

    @Override
    public void mfz() {
        fz.mfz();
        System.out.println("+200");
    }
}
