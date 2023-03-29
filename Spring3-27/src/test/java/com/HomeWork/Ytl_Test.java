package com.HomeWork;

import com.HomeWork.QiMa;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @version 1.0
 * @auther YTL
 * @className com.HomeWork.Ytl_Test
 * since 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:SpringOne.xml")
public class Ytl_Test {
@Autowired
private QiMa qiMa;

    @Test
    public void Demo2(){
        qiMa.qima();
    }
}
