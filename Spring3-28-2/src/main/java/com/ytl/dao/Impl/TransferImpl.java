package com.ytl.dao.Impl;

import com.ytl.dao.Transfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @version 1.0
 * @auther YTL
 * @className TransferMoneyImpl
 * since 1.0
 */
@Repository
public class TransferImpl implements Transfer {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void inTransfer(Integer inId, double money) {
        String sql="update t_bank set balance=balance+? where id=?";
        jdbcTemplate.update(sql,money,inId);
    }

    @Override
    public void outTransfer(Integer outId, double money) {
        String sql="update t_bank set balance=balance-? where id=?";
        jdbcTemplate.update(sql,money,outId);
    }
}
