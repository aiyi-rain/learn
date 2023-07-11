package wy.userconsumer.event;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;

/**
 * @Author:王艺
 * @Project:learn
 * @File:UserEvent
 * @Date:2023/7/11 16:45
 */
@Data
public class UserEvent extends RemoteApplicationEvent {
    private static final Logger LOGGER= LoggerFactory.getLogger(UserEvent.class);
    public static final String ET_UPDATE="USER_UPDATE";
    public static final String ET_DELETE="USER_DELETE";
    private String action;
    private String uniqueKey;

    public UserEvent(Object source, String originService, String destination, String action, String id) {
        super(source, originService, destination);
        LOGGER.info("===>user event{},{},{}<===",source,originService,destination);
        this.action = action;
        this.uniqueKey=id;
    }
}
