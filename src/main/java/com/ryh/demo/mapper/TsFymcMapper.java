package com.ryh.demo.mapper;

import com.ryh.demo.po.TsFymc;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TsFymcMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_fymc
     *
     * @mbg.generated Sat Dec 12 11:09:15 CST 2020
     */
    int deleteByPrimaryKey(String fydm);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_fymc
     *
     * @mbg.generated Sat Dec 12 11:09:15 CST 2020
     */
    int insert(TsFymc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_fymc
     *
     * @mbg.generated Sat Dec 12 11:09:15 CST 2020
     */
    int insertSelective(TsFymc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_fymc
     *
     * @mbg.generated Sat Dec 12 11:09:15 CST 2020
     */
    TsFymc selectByPrimaryKey(String fydm);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_fymc
     *
     * @mbg.generated Sat Dec 12 11:09:15 CST 2020
     */
    int updateByPrimaryKeySelective(TsFymc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_fymc
     *
     * @mbg.generated Sat Dec 12 11:09:15 CST 2020
     */
    int updateByPrimaryKey(TsFymc record);

    List<TsFymc> listAll();
}