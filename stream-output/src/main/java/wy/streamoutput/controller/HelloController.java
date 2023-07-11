package wy.streamoutput.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wy.streamoutput.msg.SendMsgProducer;

import javax.annotation.Resource;

/**
 * @Author:王艺
 * @Project:learn
 * @File:HelloController
 * @Date:2023/7/11 13:24
 */
@RestController
@RequestMapping("/test")
public class HelloController {
    @Resource
    private SendMsgProducer sendMsgProducer;
    @RequestMapping("/hello")
    public void send(){
//        sendMsgProducer.sendMsg();
    }
}
