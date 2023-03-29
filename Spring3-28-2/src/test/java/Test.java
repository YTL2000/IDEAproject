import com.ytl.config.Spring_config;
import com.ytl.controller.TransferController;
import org.aspectj.apache.bcel.util.ClassPath;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @version 1.0
 * @auther YTL
 * @className Test
 * since 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Spring_config.class)
public class Test {
    @Autowired
    private TransferController transferController;
    @org.junit.Test
    public void Demo(){
        transferController.transfer(1,2,500);
    }
}
