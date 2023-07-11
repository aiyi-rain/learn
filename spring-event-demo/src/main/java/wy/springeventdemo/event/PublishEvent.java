package wy.springeventdemo.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import wy.springeventdemo.context.ApplicationContextHolder;
import wy.springeventdemo.entity.UserEvent;

import javax.annotation.Resource;

/**
 * @Author:王艺
 * @Project:learn
 * @File:PublishEvent
 * @Date:2023/7/11 16:06
 */
@Component
public class PublishEvent {
    private static final Logger LOGGER= LoggerFactory.getLogger(PublishEvent.class);
    @Resource
    private ApplicationContextHolder applicationContextHolder;
    public void fire(UserEvent userEvent){
        ApplicationContext applicationContext = applicationContextHolder.getApplicationContext();
        if (applicationContext!=null){
            LOGGER.info("===>发布事件：{}<===",userEvent);
            applicationContext.publishEvent(userEvent);
        }else {
            LOGGER.info("无法获取applicationcontext的实例");
        }
    }
}
