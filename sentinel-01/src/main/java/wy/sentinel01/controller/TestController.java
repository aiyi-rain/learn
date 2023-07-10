package wy.sentinel01.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:王艺
 * @Project:learn
 * @File:TestController
 * @Date:2023/7/10 17:48
 */
@RestController
public class TestController {
    @GetMapping("/hello/{name}")
    @SentinelResource("sayHello")
    public String hello(@PathVariable("name")String name){
        return "hello"+name;
    }
}
