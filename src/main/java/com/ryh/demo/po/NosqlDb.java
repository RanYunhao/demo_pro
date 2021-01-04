package com.ryh.demo.po;

import java.io.Serializable;
import java.util.Date;

public class NosqlDb implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nosql_db.ID
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nosql_db.NAME
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nosql_db.IP
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nosql_db.PORT
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    private String port;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nosql_db.PASSWORD
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nosql_db.DB
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    private Integer db;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nosql_db.LASTUPDATE
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    private Date lastupdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nosql_db
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nosql_db.ID
     *
     * @return the value of nosql_db.ID
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nosql_db.ID
     *
     * @param id the value for nosql_db.ID
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nosql_db.NAME
     *
     * @return the value of nosql_db.NAME
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nosql_db.NAME
     *
     * @param name the value for nosql_db.NAME
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nosql_db.IP
     *
     * @return the value of nosql_db.IP
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nosql_db.IP
     *
     * @param ip the value for nosql_db.IP
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nosql_db.PORT
     *
     * @return the value of nosql_db.PORT
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    public String getPort() {
        return port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nosql_db.PORT
     *
     * @param port the value for nosql_db.PORT
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nosql_db.PASSWORD
     *
     * @return the value of nosql_db.PASSWORD
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nosql_db.PASSWORD
     *
     * @param password the value for nosql_db.PASSWORD
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nosql_db.DB
     *
     * @return the value of nosql_db.DB
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    public Integer getDb() {
        return db;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nosql_db.DB
     *
     * @param db the value for nosql_db.DB
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    public void setDb(Integer db) {
        this.db = db;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nosql_db.LASTUPDATE
     *
     * @return the value of nosql_db.LASTUPDATE
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    public Date getLastupdate() {
        return lastupdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nosql_db.LASTUPDATE
     *
     * @param lastupdate the value for nosql_db.LASTUPDATE
     *
     * @mbg.generated Fri Dec 11 22:29:54 CST 2020
     */
    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }
}