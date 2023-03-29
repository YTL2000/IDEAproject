package com.ytl.controller;
import com.ytl.service.TransferMoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 * @version 1.0
 * @auther YTL
 * @className TransferController
 * since 1.0
 */
@Controller
public class TransferController {
    @Autowired
    private TransferMoney transferMoney;
    public void transfer(Integer inID,Integer outId,double money){
        transferMoney.transferMoney(inID,outId,money);
    }
}
