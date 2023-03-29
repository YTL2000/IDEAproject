package com.ytl.demo;

import com.ytl.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class one {
    @Test
    public void text1() throws IOException {
//1.使用Resources资源类，来获取xml文件，转换为字节输入流，作用读取xml文件；
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //2.第二步，来一个工厂：SqlSessionFactory接口;
        //mybatis:面试：涉及到哪些涉及模式，建造者模式;
        //build(字节输入流）：会针对刚才读取的mybatis.xml文件,进行一个解析，解析完毕之后，创建一个SqlSession工厂;
        //通过该工厂，可以获取sql会话；
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //3.获取会话；SqlSession:
        SqlSession sqlSession = factory.openSession();

        //4.执行sql语句；
        //4.1 增加了UserMapper.xml -放的是sql语句；做的是一个查询；
        //4.2 在mybatis-config.xml里面，增加对UserMapper.xml的关联;
        List<User> list = sqlSession.selectList("abc.selectById");
        System.out.println(list);
//        User user=new User("张三","12312");
//        int insert = sqlSession.insert("abc.insertUser", user);
//        System.out.println(insert);


        //5.关闭会话资源;关闭流对象;
        sqlSession.close();
        is.close();
    }
    @Test
    public void text2() throws IOException{
        //1.使用Resources资源类，来获取xml文件，转换为字节输入流，作用读取xml文件；
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //2.第二步，来一个工厂：SqlSessionFactory接口;
        //mybatis:面试：涉及到哪些涉及模式，建造者模式;
        //build(字节输入流）：会针对刚才读取的mybatis.xml文件,进行一个解析，解析完毕之后，创建一个SqlSession工厂;
        //通过该工厂，可以获取sql会话；
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //3.获取会话；SqlSession:
        SqlSession sqlSession = factory.openSession();

        //4.执行sql语句；
        //4.1 增加了UserMapper.xml -放的是sql语句；做的是一个查询；
        //4.2 在mybatis-config.xml里面，增加对UserMapper.xml的关联;
        User user=new User("张三","12312");
        int insert = sqlSession.insert("abc.insertUser", user);
        sqlSession.commit();
        System.out.println(insert);


        //5.关闭会话资源;关闭流对象;
        sqlSession.close();
        is.close();
    }
    @Test
    public void text3() throws IOException{
        //1.使用Resources资源类，来获取xml文件，转换为字节输入流，作用读取xml文件；
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //2.第二步，来一个工厂：SqlSessionFactory接口;
        //mybatis:面试：涉及到哪些涉及模式，建造者模式;
        //build(字节输入流）：会针对刚才读取的mybatis.xml文件,进行一个解析，解析完毕之后，创建一个SqlSession工厂;
        //通过该工厂，可以获取sql会话；
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //3.获取会话；SqlSession:
        SqlSession sqlSession = factory.openSession();
        //4.执行sql语句；
        //4.1 增加了UserMapper.xml -放的是sql语句；做的是一个查询；
        //4.2 在mybatis-config.xml里面，增加对UserMapper.xml的关联;
        Object o = sqlSession.selectList("Map.countLimitUser");
        System.out.println(o);
        //5.关闭会话资源;关闭流对象;
        sqlSession.close();
        is.close();
    }
}
