import com.ytl.config.Spring_config;
import com.ytl.controller.ProductController;
import com.ytl.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @version 1.0
 * @auther YTL
 * @className Ytl_Test
 * since 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(value = "classpath:spring.xml")用xml文件引入
@ContextConfiguration(classes = Spring_config.class)//用配置文件引入
public class Ytl_Test {
    @Autowired
      private ProductController productController;
    @Autowired
    private Product product;
    @Test
    public void Demo(){
        //查看所有
        System.out.println(productController.findAllProduct());
    }
    @Test
    public void Demo1(){
        //根据id查看
        System.out.println(productController.findProduct(1));
    }
    @Test
    public void Demo2(){
        //添加
        product=new Product(null,"2023-3-24","护肝片",32.5,"黑龙江");
        System.out.println(productController.addProduct(product));
    }
    @Test
    public void Demo3(){
        //根据id删除
        System.out.println(productController.delProduct(4));
    }
    @Test
    public void Demo4(){
        //根据id修改
        product=new Product(5,"1010","茶叶",32.5,"黑龙江");
        System.out.println(productController.updProduct(product));
    }
}
