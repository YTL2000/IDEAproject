package com.ytl.dao;

/**
 * @version 1.0
 * @auther YTL
 * @className ProductDao
 * since 1.0
 */
public interface ProductDao {


    /**
     * 更新商品库存
     * @param pid 商品id
     * @param num 购买数量
     * @return
     */
    Integer updProduct(Integer pid,Integer num);


    /**
     * 根据id来查询商品价格
     * @param id 商品id
     * @return
     */
    Double selProductPrice(Integer id);
}
