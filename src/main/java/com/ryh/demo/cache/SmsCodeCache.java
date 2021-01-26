package com.ryh.demo.cache;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@CacheConfig(cacheNames = "smsCode")
public class SmsCodeCache {

    /**
     * Put string.
     *
     * @param key  the key
     * @param code the code
     * @return the string
     */
    @CachePut(key = "#key")
    public void put(String key,String code){
        log.info("执行 cachePut");
    }

    @CacheEvict(key = "#key")
    public void  expire(String key){
        log.info("执行 cacheExpire");
    }


    @Cacheable(key = "#key")
    public String get(String key){
        log.info("执行 cacheGet");
        return null;
    }

}
