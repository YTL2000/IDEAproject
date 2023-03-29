import com.ytl.config.Spring_config;
import com.ytl.controller.UserBuyController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @version 1.0
 * @auther YTL
 * @className YTL_test
 * since 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Spring_config.class)
public class YTL_test {
    @Autowired
    private UserBuyController userBuyController;
    @Test
    public void demo1(){
        //用户id为1  买2个id为1的商品
        userBuyController.userBuyProduct(1,2,1);
    }
}
