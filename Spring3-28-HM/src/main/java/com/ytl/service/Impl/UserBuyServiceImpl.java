package com.ytl.service.Impl;

import com.ytl.dao.ProductDao;
import com.ytl.dao.UserDao;

import com.ytl.service.UserBuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @version 1.0
 * @auther YTL
 * @className UserBuyImpl
 * since 1.0
 */
@Service
@EnableAspectJAutoProxy
public class UserBuyServiceImpl implements UserBuyService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private ProductDao productDao;

    /**
     * @param uid 用户id
     * @param pNum  购买的商品数量
     * @param pId 购买的商品id
     */
    @Override
    @Transactional
    public void userBuyProduct(Integer uid, Integer pNum, Integer pId) {
        Double userMoney = userDao.selUserMoney(uid);//查询你的账户余额
        Double productPrice=productDao.selProductPrice(pId);//查询货品单价
        if (userMoney<pNum*productPrice){
            System.out.println("你的钱不够！");
        }else {
            productDao.updProduct(pId,pNum);//更新库存
            int i=10/0;
            userDao.updUserMoney(uid,pNum*productPrice);//更新账户余额
            System.out.println("购买成功！");
        }

    }
}
