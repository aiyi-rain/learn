package wy.springeventdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @Author:王艺
 * @Project:learn
 * @File:UserEvent
 * @Date:2023/7/11 15:55
 */
@Data
public class UserEvent extends ApplicationEvent {
    private String action;
    private User user;

    public UserEvent(Object source, User user) {
        super(source);
        this.user = user;
    }
}
