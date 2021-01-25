package com.ryh.demo.config.db;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    /**
     * jdbc属性
     */
    @Autowired
    private PropertiesJdbc propertiesJdbc;

    /**
     * 属性德鲁伊
     */
    @Autowired
    private PropertiesDruid propertiesDruid;


    /**
     * 基础数据源
     *
     * @return {@link DataSource}
     */
    @Bean
    public DataSource baseDataSource(){
        DruidDataSource baseDataSource = new DruidDataSource();
        baseDataSource.setDriverClassName(propertiesJdbc.getDriverClassName());
        baseDataSource.setUrl(propertiesJdbc.getUrl());
        baseDataSource.setUsername(propertiesJdbc.getUsername());
        baseDataSource.setPassword(propertiesJdbc.getPassword());
        setDruidProperties(baseDataSource);
        return baseDataSource;
    }

    /**
     * jdbc模板
     *
     * @return {@link JdbcTemplate}
     */
    @Bean
    public JdbcTemplate baseJdbcTemplate(){
        return new JdbcTemplate(baseDataSource());
    }

    /**
     * 基础sql会话工厂
     *
     * @return {@link SqlSessionFactory}
     * @throws Exception the ex
     */
    @Bean
    public SqlSessionFactory baseSqlSessionFactory() throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(baseDataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("mapper/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    /**
     * 基地事务管理器
     *
     * @return {@link PlatformTransactionManager}
     */
    @Bean
    public PlatformTransactionManager baseTransactionManager(){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(baseDataSource());
        return transactionManager;
    }


    /**
     * 设置德鲁伊属性
     *
     * @param dataSource 数据源
     */
    public void setDruidProperties(DruidDataSource dataSource){
        dataSource.setInitialSize(propertiesDruid.getInitialSize());
        dataSource.setMinIdle(propertiesDruid.getMinIdle());
        dataSource.setMaxActive(propertiesDruid.getMaxActive());
        dataSource.setMaxWait(propertiesDruid.getMaxWait());
        dataSource.setTimeBetweenEvictionRunsMillis(propertiesDruid.getTimeBetweenEvictionRunsMillis());
        dataSource.setMinEvictableIdleTimeMillis(propertiesDruid.getMinEvictableIdleTimeMillis());
        dataSource.setTestWhileIdle(false);
    }
}
