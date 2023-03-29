package com.ytl.dao;

/**
 * @version 1.0
 * @auther YTL
 * @className TransferMoney
 * since 1.0
 */
public interface Transfer {
    void inTransfer( Integer inId,double money);
    void outTransfer(Integer outId,double money);
}
