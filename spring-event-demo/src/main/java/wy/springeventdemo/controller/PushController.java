package wy.springeventdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wy.springeventdemo.entity.User;
import wy.springeventdemo.entity.UserEvent;
import wy.springeventdemo.event.PublishEvent;

import javax.annotation.Resource;

/**
 * @Author:王艺
 * @Project:learn
 * @File:PushController
 * @Date:2023/7/11 16:20
 */
@RestController
public class PushController {
    @Resource
    private PublishEvent publishEvent;
    @GetMapping("/push")
    public void push(){
        User user = new User(1, "wangyi");
        publishEvent.fire(new UserEvent("localhost",user));
    }
}
