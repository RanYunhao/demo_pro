package com.ryh.demo.controller;

import com.ryh.demo.cache.SmsCodeCache;
import com.ryh.demo.cache.TsFymcCache;
import com.ryh.demo.utils.response.ResResult;
import com.ryh.demo.utils.response.ResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping(value = "/cache")
public class CacheApi {

    @Resource
    private SmsCodeCache smsCodeCache;
    @Resource
    private TsFymcCache tsFymcCache;

    @GetMapping(value = "/getByDm")
    public ResponseVO getByDm(String key){
        return ResResult.successWithData(tsFymcCache.getTsFymcByDm(key));
    }
    @GetMapping(value = "/getByFydm")
    public ResponseVO getByFydm(String key){
        return ResResult.successWithData(tsFymcCache.getTsFymcByFydm(key));
    }

    @PostMapping(value = "/expire")
    public ResponseVO expire(String key){
        tsFymcCache.expire(key);
        return ResResult.success();
    }

    @PostMapping(value = "/expireAll")
    public ResponseVO expireAll(){
        tsFymcCache.expireAll();
        return ResResult.success();
    }

}
