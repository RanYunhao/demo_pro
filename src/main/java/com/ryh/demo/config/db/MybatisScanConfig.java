package com.ryh.demo.config.db;


import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@AutoConfigureAfter(DataSourceConfig.class)
public class MybatisScanConfig {

    @Bean
    public MapperScannerConfigurer baseMapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("baseSqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.ryh.demo.mapper");
        return mapperScannerConfigurer;
    }
}
