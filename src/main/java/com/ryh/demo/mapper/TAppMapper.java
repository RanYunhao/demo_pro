package com.ryh.demo.mapper;

import com.ryh.demo.po.TApp;
import com.ryh.demo.po.TAppKey;
import org.springframework.stereotype.Repository;

@Repository
public interface TAppMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_app
     *
     * @mbg.generated Sat Dec 12 11:11:10 CST 2020
     */
    int deleteByPrimaryKey(TAppKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_app
     *
     * @mbg.generated Sat Dec 12 11:11:10 CST 2020
     */
    int insert(TApp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_app
     *
     * @mbg.generated Sat Dec 12 11:11:10 CST 2020
     */
    int insertSelective(TApp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_app
     *
     * @mbg.generated Sat Dec 12 11:11:10 CST 2020
     */
    TApp selectByPrimaryKey(TAppKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_app
     *
     * @mbg.generated Sat Dec 12 11:11:10 CST 2020
     */
    int updateByPrimaryKeySelective(TApp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_app
     *
     * @mbg.generated Sat Dec 12 11:11:10 CST 2020
     */
    int updateByPrimaryKey(TApp record);
}