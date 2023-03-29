package com.ytl.dao.Impl;

import com.ytl.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @auther YTL
 * @className ProductDaoImpl
 * since 1.0
 */
@Component
public class ProductDaoImpl implements ProductDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 更新商品库存
     *
     * @param pid 所购买商品id
     * @param num 购买商品数量
     * @return
     */
    @Override
    public Integer updProduct(Integer pid, Integer num) {
        String sql = "update t_meituan set kucun=(kucun-?) where pid=?";
        return jdbcTemplate.update(sql, num, pid);
    }

    /**
     * 查询商品价格
     * @param pid 商品id
     * @return
     */
    @Override
    public Double selProductPrice(Integer pid) {
        String sql = "select price from t_meituan where pid=?";
        return jdbcTemplate.queryForObject(sql, Double.class, pid);
    }
}
