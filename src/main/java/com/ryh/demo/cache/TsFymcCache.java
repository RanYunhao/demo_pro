package com.ryh.demo.cache;


import com.ryh.demo.mapper.TsFymcMapper;
import com.ryh.demo.po.TsFymc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@CacheConfig(cacheNames = "TsFymc")
@Component
public class TsFymcCache {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private TsFymcMapper tsFymcMapper;

    /**
     * Put string.
     *
     * @param key  the key
     * @param tsFymc the tsFymc
     */
    @CachePut(key = "#key")
    public void putByDm(String key, TsFymc tsFymc){
        log.info("执行 cachePutTsFymcByDm:{}", key);
    }

    @CacheEvict(key = "#key")
    public void  expire(String key){
        log.info("执行 cacheExpire:{}", key);
    }

    @CacheEvict(allEntries = true)
    public void expireAll(){
        log.info("执行 cacheExpireAll");
    }
    @Cacheable(key = "#key")
    public TsFymc getTsFymcByDm(String key) {
        log.info("执行 getTsFymcByDm:{}", key);
        return tsFymcMapper.getTsFymcByDm(Integer.parseInt(key));
    }
    @Cacheable(key = "#key")
    public TsFymc getTsFymcByFydm(String key) {
        log.info("执行 getTsFymcByFydm:{}", key);
        return tsFymcMapper.selectByPrimaryKey(key);
    }


}
