package com.ytl.service;

/**
 * @version 1.0
 * @auther YTL
 * @className UserBuy
 * since 1.0
 */
public interface UserBuyService {
    /**
     *  用户购买操作
     * @param uId 用户id
     * @param pNum  购买的商品数量
     * @param pId 购买的商品id
     */
    void userBuyProduct(Integer uId,Integer pNum,Integer pId);
}
