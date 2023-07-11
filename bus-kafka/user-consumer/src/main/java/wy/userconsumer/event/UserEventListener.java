package wy.userconsumer.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author:王艺
 * @Project:learn
 * @File:UserEventListener
 * @Date:2023/7/11 17:46
 */
@Component
public class UserEventListener implements ApplicationListener<UserEvent> {
    private static final Logger LOGGER= LoggerFactory.getLogger(UserEventListener.class);
    @PostConstruct
    public void doSomething(){
        LOGGER.info("====dosomething====");
    }
    @Override
    public void onApplicationEvent(UserEvent event) {
        LOGGER.debug("===收到用户事件{}===",event);
    }
}
