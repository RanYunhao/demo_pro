package com.ryh.demo.mapper;

import com.ryh.demo.po.RTaskHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface RTaskHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rtask_history
     *
     * @mbg.generated Sat Dec 12 14:32:24 CST 2020
     */
    int deleteByPrimaryKey(String rwlsh);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rtask_history
     *
     * @mbg.generated Sat Dec 12 14:32:24 CST 2020
     */
    int insert(RTaskHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rtask_history
     *
     * @mbg.generated Sat Dec 12 14:32:24 CST 2020
     */
    int insertSelective(RTaskHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rtask_history
     *
     * @mbg.generated Sat Dec 12 14:32:24 CST 2020
     */
    RTaskHistory selectByPrimaryKey(String rwlsh);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rtask_history
     *
     * @mbg.generated Sat Dec 12 14:32:24 CST 2020
     */
    int updateByPrimaryKeySelective(RTaskHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rtask_history
     *
     * @mbg.generated Sat Dec 12 14:32:24 CST 2020
     */
    int updateByPrimaryKey(RTaskHistory record);
}