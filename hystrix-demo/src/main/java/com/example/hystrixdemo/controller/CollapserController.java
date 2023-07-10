package com.example.hystrixdemo.controller;

import com.example.hystrixdemo.entity.User;
import com.example.hystrixdemo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author:王艺
 * @Project:learn
 * @File:CollapserController
 * @Date:2023/7/10 14:02
 */
@RestController
public class CollapserController {
    @Resource
    private UserService userService;
    @GetMapping("/collapser")
    public String collapser(){
        new Thread(){
            @Override
            public void run() {
                User user = userService.getUserById(1L);
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                User user = userService.getUserById(2L);
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                User user = userService.getUserById(3L);
            }
        }.start();
        return "操作成功";
    }
}
