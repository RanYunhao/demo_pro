package com.ryh.demo.controller;

import com.ryh.demo.service.HsgService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test/")
public class HsgController {

    @Resource
    private HsgService hsgService;

    @GetMapping(value = "get")
    public Object get(){
        return hsgService.getFyList();
    }


    @PostMapping(value = "set")
    public Object set(){
        return hsgService.testTranscation();
    }
}
