package CjLibtest;

import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @auther YTL
 * @className HorseImpl
 * since 1.0
 */
@Component
public class HorseImpl implements Horse{
    @Override
    public void rent() {
        System.out.println("一室一厅 1000");
    }
}
