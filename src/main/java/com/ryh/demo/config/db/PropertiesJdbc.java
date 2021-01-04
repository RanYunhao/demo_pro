package com.ryh.demo.config.db;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * jdbc配置
 *
 * @author Administrator
 * @date 2020/12/11
 */
@Component
@PropertySource(value = "classpath:config/jdbc.properties")
@ConfigurationProperties(prefix = "jdbc")
public class PropertiesJdbc {

    /**
     * 用户名
     */
    private String username;

    /**
     * 数据库密码
     */
    private String password;

    /**
     * url
     */
    private String url;

    /**
     * 数据源名称
     */
    private String name;

    /**
     * 驱动程序类名称
     */
    private String driverClassName;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
}
