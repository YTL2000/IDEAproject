import com.ytl.dao.ProductDao;
import com.ytl.entity.Order;
import com.ytl.entity.Product;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @auther YTL
 * @className text01
 * since 1.0
 */
public class text01 {
    @Test
    public void demo1(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("spring01.xml");
        Product p1 = (Product) cpx.getBean("p1");
        System.out.println(p1);
    }
    @Test
    public void demo2(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("spring01.xml");
        Product p1 = (Product) cpx.getBean("p1");
        ProductDao productDao = (ProductDao) cpx.getBean("productDao");
        System.out.println(productDao.saveProduct(p1));
    }
    //工厂的普通方法
    @Test
    public void demo3(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("spring01.xml");
        Product factoryDemo = (Product) cpx.getBean("FactoryDemo");
        System.out.println(factoryDemo);
    }
    //工厂的静态方法
    @Test
    public void demo4(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("spring01.xml");
        Product factoryDemo = (Product) cpx.getBean("FactoryStaticDemo");
        System.out.println(factoryDemo);
    }
    @Test
    public void demo5(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("spring02.xml");
        Product p1 = cpx.getBean("p1", Product.class);
        System.out.println(p1);
    }
    @Test
    public void demo6(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("spring03.xml");
        Product p2 = cpx.getBean("p2", Product.class);
        System.out.println(p2);
    }
    @Test
    public void demo7(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("spring04.xml");
        Order order = cpx.getBean("order", Order.class);
        System.out.println(order);
        cpx.close();
    }
}
