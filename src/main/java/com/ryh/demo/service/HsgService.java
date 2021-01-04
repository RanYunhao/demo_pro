package com.ryh.demo.service;


import cn.hutool.core.lang.UUID;
import cn.hutool.json.JSONUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ryh.demo.mapper.RTaskRwddMapper;
import com.ryh.demo.mapper.RTaskSuccessMapper;
import com.ryh.demo.mapper.TsFymcMapper;
import com.ryh.demo.po.RTaskRwdd;
import com.ryh.demo.po.RTaskSuccess;
import com.ryh.demo.po.TsFymc;
import com.ryh.demo.utils.response.ResResult;
import com.ryh.demo.utils.response.ResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HsgService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HsgService.class);

    @Resource
    private TsFymcMapper tsFymcMapper;

    @Resource
    private RTaskSuccessMapper rTaskSuccessMapper;

    @Resource
    private RTaskRwddMapper rTaskRwddMapper;


    public PageInfo<TsFymc> getFyList(){
        PageHelper.startPage(1, 20);
        List<TsFymc> tsFymcList = tsFymcMapper.listAll();
        return new PageInfo<TsFymc>(tsFymcList);
    }

    @Transactional(value = "baseTransactionManager", rollbackFor = Exception.class)
    public ResponseVO testTranscation(){
        RTaskRwdd rTaskRwdd = new RTaskRwdd();
        rTaskRwdd.setRwlsh(UUID.fastUUID().toString(true));
        int updateRow = rTaskRwddMapper.insert(rTaskRwdd);
        if (updateRow < 0) {
            LOGGER.error("插入信息异常{}", JSONUtil.parse(rTaskRwdd).toString());
            throw new RuntimeException("");
        }
        RTaskSuccess rTaskSuccess = new RTaskSuccess();
        rTaskSuccess.setRwlsh(UUID.fastUUID().toString(true));
        updateRow = rTaskSuccessMapper.insert(rTaskSuccess);
        if (updateRow < 0) {
            LOGGER.error("插入信息异常{}", JSONUtil.parse(rTaskSuccess).toString());
            throw new RuntimeException("");
        }
        return ResResult.success();
    }

}
