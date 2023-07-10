package com.example.hystrixdemo.controller;

import com.example.hystrixdemo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author:王艺
 * @Project:learn
 * @File:CacheController
 * @Date:2023/7/10 13:20
 */
@RestController
public class CacheController {
    @Resource
    private UserService userService;
    @GetMapping("/cache/{id}")
    public String cache(@PathVariable("id")Long id){
        userService.getUserCache(id);
        userService.getUserCache(id);
        userService.getUserCache(id);
        return "操作成功";
    }
}
