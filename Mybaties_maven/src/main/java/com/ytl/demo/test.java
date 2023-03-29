package com.ytl.demo;

import com.ytl.dao.UserMapper;
import com.ytl.pojo.User;
import com.ytl.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.util.List;

public class test {
    SqlSession sqlSession =null;
    UserMapper mapper =null;
    @Before
    public void before(){
        sqlSession = MybatisUtil.getSqlSession();
        mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println("before");
    }
    @Test
    public void test01(){
        System.out.println(mapper.addUser("龙腾余", "123123"));
    }


    @Test
    public void test02(){

//        List<User> list = mapper.selectById("余");
        List<User> list = mapper.selectById("%余%");
//        List<User> list = mapper.selectById("余");
        System.out.println(list);
    }
    @After
    public void after(){
        sqlSession.commit();
        sqlSession.close();
        System.out.println("after");
    }
}
