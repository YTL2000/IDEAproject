package com.ytl.config;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * 该类是一个配置类；
 * @Configuration():标识该类是配置类，替换了之前的spring.xml
 * @version 1.0
 * @auther YTL
 * @className Spring_config
 * since 1.0
 */
@PropertySource(value = "classpath:jdbc.properties")
@ComponentScan(basePackages = "com.ytl")
@Configuration
@EnableAspectJAutoProxy//事务第一步
public class Spring_config {
    @Value("${jdbc.driverClassName}")
    private String driverClassName;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    /**
     * 将返回的对象，作为bean;
     * @return
     */
    //在配置这里，实现找到Datasource这个bean的功能；
    @Bean("dataSource")
    public DataSource getDataSource(){
        DruidDataSource ds=new DruidDataSource(); //创建一个dataSource;
        ds.setDriverClassName(driverClassName);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
    /**
     * 将返回的对象，作为bean;
     * @return
     */
    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager=new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return  transactionManager;
    }
}
