import com.ytl.config.Spring_config;
import com.ytl.controller.CustomerController;
import com.ytl.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @version 1.0
 * @auther YTL
 * @className YTL_Test
 * since 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Spring_config.class)
public class YTL_Test {
    @Autowired
    private CustomerController cc;
    @Test
    public void Demo1(){
        int i = cc.addCustomer(new Customer(null, "阿尼亚", "123123asdsa"));
        System.out.println("添加用户："+i);
        int count = cc.countCustomer();
        System.out.println("统计用户条数："+count);
        Customer customer = cc.findByIdCustomer(1);
        System.out.println("根据id查看用户："+customer);
        int updCustomer = cc.updCustomer(new Customer(1, "admin", "asdzxc"));
        System.out.println("修改用户："+updCustomer);
        System.out.println("查询所有："+i);
        List<Customer> customers = cc.findAllCustomer();
        for (Customer c:customers) {
            System.out.println(c);
        }
        int delCustomer = cc.delCustomer("阿%");
        System.out.println("模糊删除："+delCustomer);
    }

}
