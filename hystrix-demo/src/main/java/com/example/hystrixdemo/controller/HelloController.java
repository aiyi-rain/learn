package com.example.hystrixdemo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:王艺
 * @Project:hystrix-demo
 * @File:HelloController
 * @Date:2023/7/10 12:57
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "fallbackHello")
    @HystrixProperty(name = "excution.isolation.thread.timeoutInMilliseconds",value = "1000")
    public String hello() throws InterruptedException {
        Thread.sleep(3000);
        return "hello,wangyi";
    }
    private String fallbackHello(){
        return "请求失败，响应超时";
    }
}
