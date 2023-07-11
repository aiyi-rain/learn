package wy.springeventdemo.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author:王艺
 * @Project:learn
 * @File:UserListener
 * @Date:2023/7/11 16:18
 */
@Component
public class UserListener implements ApplicationListener {
    private static final Logger LOGGER= LoggerFactory.getLogger(UserListener.class);
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        LOGGER.info("收到用户事件{}",event);
        //业务代码
    }
}
