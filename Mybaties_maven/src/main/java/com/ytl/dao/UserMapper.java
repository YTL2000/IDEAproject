package com.ytl.dao;

import com.ytl.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    public int addUser(@Param("name") String name, @Param("pwd") String pwd);
    public List<User> selectById(@Param("name") String name);
}
