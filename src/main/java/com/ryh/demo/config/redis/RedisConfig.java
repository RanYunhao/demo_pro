package com.ryh.demo.config.redis;

import com.ryh.demo.mapper.NosqlDbMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;

/**
 * redis配置
 *
 * @author Administrator
 * @date 2020/12/12
 */
@Configuration(proxyBeanMethods = false)
@AutoConfigureAfter(NosqlDbMapper.class)
public class RedisConfig {
    @Autowired
    private NosqlDbMapper nosqlDbMapper;



}
