import com.ytl.dao.Horse;
import com.ytl.dao.IWeapon;
import com.ytl.entity.Role;
import com.ytl.entity.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @auther YTL
 * @className test
 * since 1.0
 */
public class Ytl_Test {
    @Test
    public void demo(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("springOne.xml");
        Role guanyu = cpx.getBean("Guanyu", Role.class);//创建关羽
//        Role zhangfei = cpx.getBean("ZhangFei", Role.class);//创建张飞
//        IWeapon zf = (IWeapon) cpx.getBean("zf");//创建丈八蛇
//        Horse ZfHorse = (Horse) cpx.getBean("zf");//创建张飞的马
        IWeapon gy = (IWeapon) cpx.getBean("gy");//创建青龙偃月刀
        Horse GyHorse = (Horse) cpx.getBean("gy");//创建关羽的马
        System.out.println(gy.attact(guanyu)+GyHorse.ZuoQi(guanyu));
        //System.out.println(zf.attact(zhangfei)+ZfHorse.ZuoQi(zhangfei)+"\tPK\t" +gy.attact(guanyu)+GyHorse.ZuoQi(guanyu));
    }
    @Test
    public void demo2(){
        System.out.println(User.getUser());

    }
}
