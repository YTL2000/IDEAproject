/**
 * @version 1.0
 * @auther YTL
 * @className Factory
 * since 1.0
 */
abstract class Phone{
    abstract void phone();
}
class HuaWei extends Phone{
    @Override
    void phone() {
        System.out.println("生产华为手机");
    }
}
class XiaoMi extends Phone{
    @Override
    void phone() {
        System.out.println("生产小米手机");
    }
}
class PhoneFactory{
    private PhoneFactory phoneFactory;
    public static HuaWei creatHW(){
        return new HuaWei();
    }//通过创建静态方法来直接获得对应华为对象 从而可以调用phone方法
    public static XiaoMi creatXM(){
        return new XiaoMi();
    }
}
public class Factory {
    public static void main(String[] args) {
        //通过调用工厂方法最直接获得对应对象
        HuaWei huaWei = PhoneFactory.creatHW();
        huaWei.phone();
        XiaoMi xiaoMi = PhoneFactory.creatXM();
        xiaoMi.phone();
    }
}
