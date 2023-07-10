package wy.turbineuserservice.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:王艺
 * @Project:learn
 * @File:UserController
 * @Date:2023/7/10 16:09
 */
@RestController
public class UserController {
    @RequestMapping("/user")
    @HystrixCommand(fallbackMethod = "fallback")
    @HystrixProperty(name = "excution.isolation.thread.timeoutInMilliseconds",value = "3000")
    public String getUser(){
        return "wangyi,hello";
    }
    private String fallback(){
        return "连接超时";
    }
}
