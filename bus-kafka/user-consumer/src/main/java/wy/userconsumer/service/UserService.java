package wy.userconsumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import wy.userconsumer.entity.User;
import wy.userconsumer.event.ApplicationContextHolder;
import wy.userconsumer.event.RemoteApplicationEventPublisher;
import wy.userconsumer.event.UserEvent;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:王艺
 * @Project:learn
 * @File:UserService
 * @Date:2023/7/11 16:55
 */
@Service
public class UserService {
    public static final Logger LOGGER= LoggerFactory.getLogger(UserService.class);
    private List<User> users;
    @Resource
    private ApplicationContextHolder applicationContextHolder;

    public UserService() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1,"wangyi"));
        users.add(new User(2,"wanger"));
        this.users=users;
    }
    public List<User> findAll(){
        return this.users;
    }
    public User save(User userDTO){
        for (User user:this.users
             ) {
            if (user.getId()== userDTO.getId()){
                user.setName(userDTO.getName());
                break;
            }
        }
        this.users.add(userDTO);
        this.fireEvent(UserEvent.ET_UPDATE,userDTO);
        return userDTO;
    }
    private void fireEvent(String eventAction,User user){
        LOGGER.info("+++context:{}+++",applicationContextHolder.getApplicationContext().getId());
        UserEvent userEvent=new UserEvent(user,
                applicationContextHolder.getApplicationContext().getId(),
                "*:**",eventAction,String.valueOf(user.getId()));
        RemoteApplicationEventPublisher.pulishEvent(userEvent,applicationContextHolder);
    }
}
