package com.ryh.demo.config.redis;

import cn.hutool.core.util.NumberUtil;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.ryh.demo.enums.CacheNameEnum;
import com.ryh.demo.mapper.NosqlDbMapper;
import com.ryh.demo.po.NosqlDb;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettucePoolingClientConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

/**
 * redis配置
 *
 * @author Administrator
 * date 2020/12/12
 */
@AutoConfigureAfter(NosqlDbMapper.class)
@Configuration
public class RedisConfig {
    @Autowired
    private NosqlDbMapper nosqlDbMapper;

    @Bean
    public LettuceConnectionFactory redisFactory(){
        NosqlDb nosqlDb = nosqlDbMapper.selectByPrimaryKey("loacl_redis");
        RedisStandaloneConfiguration redisConfiguration = new RedisStandaloneConfiguration();
        redisConfiguration.setDatabase(nosqlDb.getDb());
        redisConfiguration.setHostName(nosqlDb.getIp());
        redisConfiguration.setPort(NumberUtil.parseInt(nosqlDb.getPort()));
        redisConfiguration.setPassword(nosqlDb.getPassword());
        return new LettuceConnectionFactory(redisConfiguration, lettuceClientConfiguration());
    }

    @Bean
    public LettuceClientConfiguration lettuceClientConfiguration() {
        return LettucePoolingClientConfiguration.builder()
                .poolConfig(genericObjectPoolConfig())
                .build();
    }

    @Bean
    public GenericObjectPoolConfig genericObjectPoolConfig() {
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        poolConfig.setMaxIdle(10);
        poolConfig.setMinIdle(5);
        poolConfig.setMaxTotal(20);
        return poolConfig;
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate(){
        RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
        template.setConnectionFactory(redisFactory());
        //使用Jackson2JsonRedisSerializer来序列化和反序列化redis的value值（默认使用JDK的序列化方式）
        Jackson2JsonRedisSerializer<Object> jacksonSeial = initJacksonSerializer();
        // 值采用json序列化
        template.setValueSerializer(jacksonSeial);
        //使用StringRedisSerializer来序列化和反序列化redis的key值
        template.setKeySerializer(new StringRedisSerializer());

        // 设置hash key 和value序列化模式
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setHashValueSerializer(jacksonSeial);
        template.afterPropertiesSet();
        return template;
    }

    @Bean
    public CacheManager cacheManager(RedisConnectionFactory redisConnectionFactory) {
        return RedisCacheManager.RedisCacheManagerBuilder.fromCacheWriter(RedisCacheWriter.nonLockingRedisCacheWriter(redisFactory()))
                // 默认策略，未配置的 key 会使用这个
                .cacheDefaults(redisConfig(24 * 60 * 60))
                // 自定义 key 策略
                .withInitialCacheConfigurations(redisCacheConfigurationMap()).build();
    }


    /**
     * Gets redis cache configuration map.
     *
     * @return the redis cache configuration map
     * @see CacheNameEnum
     */
    private Map<String, RedisCacheConfiguration> redisCacheConfigurationMap() {
        Class<CacheNameEnum> cacheNameEnumClass = CacheNameEnum.class;
        final Enum<?>[] enums = cacheNameEnumClass.getEnumConstants();
        Map<String, RedisCacheConfiguration> redisCacheConfigurationMap = new HashMap<>(100);
        for (Enum<?> e : enums) {
            CacheNameEnum cacheEnumer = (CacheNameEnum) e;
            redisCacheConfigurationMap.put(cacheEnumer.cacheName(), this.redisConfig(cacheEnumer.ttlSecond()));
        }
        return redisCacheConfigurationMap;
    }

    /**
     * Gets redis cache configuration with ttl.
     *
     * @param seconds the seconds
     * @return the redis cache configuration with ttl
     */
    private RedisCacheConfiguration redisConfig(Integer seconds) {
        Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = initJacksonSerializer();
        RedisSerializationContext.SerializationPair<Object> objectSerializationPair = RedisSerializationContext
                .SerializationPair
                .fromSerializer(jackson2JsonRedisSerializer);

        return RedisCacheConfiguration.defaultCacheConfig()
                .serializeValuesWith(objectSerializationPair)
                // 缓存ttl
                .entryTtl(Duration.ofSeconds(seconds));
    }

    private Jackson2JsonRedisSerializer<Object> initJacksonSerializer() {
        Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<>(Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.activateDefaultTyping(LaissezFaireSubTypeValidator.instance, ObjectMapper.DefaultTyping.NON_FINAL, JsonTypeInfo.As.PROPERTY);
        //bugFix Jackson2反序列化数据处理LocalDateTime类型时出错
        om.disable(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS);
        om.registerModule(new JavaTimeModule());
        jackson2JsonRedisSerializer.setObjectMapper(om);
        return jackson2JsonRedisSerializer;
    }



}
