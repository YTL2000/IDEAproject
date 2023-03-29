package com.ytl.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
  static   InputStream is = null;
  static SqlSessionFactory factory=null;
    static {
        //1.使用Resources资源类，来获取xml文件，转换为字节输入流，作用读取xml文件；

        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //2.第二步，来一个工厂：SqlSessionFactory接口;
        //mybatis:面试：涉及到哪些涉及模式，建造者模式;
        //build(字节输入流）：会针对刚才读取的mybatis.xml文件,进行一个解析，解析完毕之后，创建一个SqlSession工厂;
        //通过该工厂，可以获取sql会话；
        factory= new SqlSessionFactoryBuilder().build(is);
    }
    public static SqlSession getSqlSession(){
        //3.获取会话；SqlSession:
        return factory.openSession();
    }
}
