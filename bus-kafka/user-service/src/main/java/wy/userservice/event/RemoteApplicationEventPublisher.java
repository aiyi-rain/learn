package wy.userservice.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;
import org.springframework.context.ApplicationContext;

/**
 * @Author:王艺
 * @Project:learn
 * @File:RemoteApplicationEventPublisher
 * @Date:2023/7/11 17:16
 */
public class RemoteApplicationEventPublisher {
    public static final Logger LOGGER= LoggerFactory.getLogger(RemoteApplicationEventPublisher.class);
    public static void pulishEvent(RemoteApplicationEvent event,ApplicationContextHolder holder){
        ApplicationContext context = holder.getApplicationContext();
        if (null!=context){
            context.publishEvent(event);
            LOGGER.info("已经发布事件：{}",event);
        }else {
            LOGGER.warn("无法获取应用上下文实例，不能发布事件。");
        }
    }
}
