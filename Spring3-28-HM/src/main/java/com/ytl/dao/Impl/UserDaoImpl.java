package com.ytl.dao.Impl;

import com.ytl.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @version 1.0
 * @auther YTL
 * @className UserDaoImpl
 * since 1.0
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * @param userId 操作的用户id
     * @return
     */
    @Override
    public Double selUserMoney(Integer userId) {
        String sql="select money from t_user where uid=?";
        return jdbcTemplate.queryForObject(sql,Double.class,userId);
    }

    /**
     * @param uid 操作用户id
     * @param money 更改的金额
     * @return
     */
    @Override
    public int updUserMoney(Integer uid,Double money) {
        String sql="update t_user set money=money-? where uid=?";
        return jdbcTemplate.update(sql,money,uid);
    }
}
