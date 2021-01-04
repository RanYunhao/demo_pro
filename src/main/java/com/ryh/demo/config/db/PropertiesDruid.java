package com.ryh.demo.config.db;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


/**
 * 属性德鲁伊
 *
 * @author Administrator
 * @date 2020/12/11
 */
@Component
@PropertySource(value = "classpath:config/druid.properties")
public class PropertiesDruid {
    /**
     * 初始大小
     */
    @Value("${druid.initialSize}")
    private int initialSize;
    /**
     * 最小空闲
     */
    @Value("${druid.minIdle}")
    private int minIdle;
    /**
     * 马克斯活跃
     */
    @Value("${druid.maxActive}")
    private int maxActive;
    /**
     * max等
     */
    @Value("${druid.maxWait}")
    private int maxWait;
    /**
     * 间隔时间驱逐飞船运行
     */
    @Value("${druid.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;
    /**
     * 最小项空闲时间,米尔斯
     */
    @Value("${druid.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;
    /**
     * 池预处理语句
     */
    @Value("${druid.poolPreparedStatements}")
    private boolean poolPreparedStatements;
    /**
     * 马克斯池事先准备好的声明中每个连接尺寸
     */
    @Value("${druid.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;
    /**
     * 过滤器
     */
    @Value("${druid.filters}")
    private String filters;
    /**
     * 连接属性
     */
    @Value("${druid.connectionProperties}")
    private String connectionProperties;

    /**
     * 用户名
     */
    @Value("${druid.username}")
    private String username;

    /**
     * 数据库密码
     */
    @Value("${druid.password}")
    private String password;

    /**
     * 属性德鲁伊
     */
    public PropertiesDruid() {
    }

    /**
     * 得到最初的大小
     *
     * @return int
     */
    public int getInitialSize() {
        return initialSize;
    }

    /**
     * 设置最初的大小
     *
     * @param initialSize 初始大小
     */
    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }

    /**
     * 得到最小值闲置
     *
     * @return int
     */
    public int getMinIdle() {
        return minIdle;
    }

    /**
     * 设置最小值闲置
     *
     * @param minIdle 最小空闲
     */
    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    /**
     * 得到马克斯活跃的
     *
     * @return int
     */
    public int getMaxActive() {
        return maxActive;
    }

    /**
     * 设置马克斯活跃的
     *
     * @param maxActive 马克斯活跃
     */
    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    /**
     * 得到马克斯等待
     *
     * @return int
     */
    public int getMaxWait() {
        return maxWait;
    }

    /**
     * 设置马克斯等待
     *
     * @param maxWait max等
     */
    public void setMaxWait(int maxWait) {
        this.maxWait = maxWait;
    }

    /**
     * 得到时间之间的驱逐运行米尔斯
     *
     * @return int
     */
    public int getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }

    /**
     * 设置时间之间的驱逐运行米尔斯
     *
     * @param timeBetweenEvictionRunsMillis 间隔时间驱逐飞船运行
     */
    public void setTimeBetweenEvictionRunsMillis(int timeBetweenEvictionRunsMillis) {
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    }

    /**
     * 得到最小值项闲置时间米尔斯
     *
     * @return int
     */
    public int getMinEvictableIdleTimeMillis() {
        return minEvictableIdleTimeMillis;
    }

    /**
     * 设置最小值项闲置时间米尔斯
     *
     * @param minEvictableIdleTimeMillis 最小项空闲时间,米尔斯
     */
    public void setMinEvictableIdleTimeMillis(int minEvictableIdleTimeMillis) {
        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    }

    /**
     * 是池预处理语句
     *
     * @return boolean
     */
    public boolean isPoolPreparedStatements() {
        return poolPreparedStatements;
    }

    /**
     * 设置池准备语句
     *
     * @param poolPreparedStatements 池预处理语句
     */
    public void setPoolPreparedStatements(boolean poolPreparedStatements) {
        this.poolPreparedStatements = poolPreparedStatements;
    }

    /**
     * 得到马克斯池准备声明每连接大小
     *
     * @return int
     */
    public int getMaxPoolPreparedStatementPerConnectionSize() {
        return maxPoolPreparedStatementPerConnectionSize;
    }

    /**
     * 设置马克斯池准备声明每连接大小
     *
     * @param maxPoolPreparedStatementPerConnectionSize 马克斯池事先准备好的声明中每个连接尺寸
     */
    public void setMaxPoolPreparedStatementPerConnectionSize(int maxPoolPreparedStatementPerConnectionSize) {
        this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
    }

    /**
     * 得到过滤器
     *
     * @return {@link String}
     */
    public String getFilters() {
        return filters;
    }

    /**
     * 设置过滤器
     *
     * @param filters 过滤器
     */
    public void setFilters(String filters) {
        this.filters = filters;
    }

    /**
     * 得到连接属性
     *
     * @return {@link String}
     */
    public String getConnectionProperties() {
        return connectionProperties;
    }

    /**
     * 设置连接属性
     *
     * @param connectionProperties 连接属性
     */
    public void setConnectionProperties(String connectionProperties) {
        this.connectionProperties = connectionProperties;
    }

    /**
     * 得到用户名
     *
     * @return {@link String}
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 得到数据库密码
     *
     * @return {@link String}
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置数据库密码
     *
     * @param password 数据库密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
