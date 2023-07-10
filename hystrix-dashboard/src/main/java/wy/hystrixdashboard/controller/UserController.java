package wy.hystrixdashboard.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:王艺
 * @Project:learn
 * @File:UserController
 * @Date:2023/7/10 14:30
 */
@RestController
public class UserController {
    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "planB")
    @HystrixProperty(name = "excution.isolation.thread.timeoutInMilliseconds",value = "1000")
    public String hello() throws InterruptedException {
        Thread.sleep(2000);
        return "hello wangyi";
    }
    private String planB(){
        return "系统繁忙，请稍后再试哦";
    }
}
