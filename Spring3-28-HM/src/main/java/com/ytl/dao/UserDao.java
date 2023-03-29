package com.ytl.dao;

/**
 * @version 1.0
 * @auther YTL
 * @className UserDao
 * since 1.0
 */
public interface UserDao {


    /**
     * 根据id查找用户余额
     * @param userId 操作的用户id
     * @return
     */
    Double selUserMoney(Integer userId);


    /**
     * 更新用户money
     * @param uid 操作用户id
     * @param money 更改的金额
     * @return
     */
    int updUserMoney(Integer uid,Double money);
}
