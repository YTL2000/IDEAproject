package com.ytl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @version 1.0
 * @auther YTL
 * @className Ytl_test
 * since 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:SpringOne.xml")
public class Ytl_test {
    @Autowired
    private GuanYuDao guanYuDao;
    @Test
    public void Demo(){
        guanYuDao.horse();
    }

}
