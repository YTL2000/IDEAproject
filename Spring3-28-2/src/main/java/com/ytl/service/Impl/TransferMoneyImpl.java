package com.ytl.service.Impl;

import com.ytl.dao.Transfer;
import com.ytl.service.TransferMoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @version 1.0
 * @auther YTL
 * @className TransferMoneyImpl
 * since 1.0
 */
@Service
public class TransferMoneyImpl implements TransferMoney {
    @Autowired
private Transfer transfer;
    @Override
    @Transactional//开启针对此方法的事务
    public void transferMoney(Integer inID,Integer outId,double money) {
        transfer.outTransfer(outId,money);
//        int i=10/0;
        transfer.inTransfer(inID,money);
    }
}
