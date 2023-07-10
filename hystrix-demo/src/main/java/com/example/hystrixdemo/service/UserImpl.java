package com.example.hystrixdemo.service;

import com.example.hystrixdemo.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheRemove;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:王艺
 * @Project:learn
 * @File:UserImpl
 * @Date:2023/7/10 13:22
 */
@Component
public class UserImpl implements UserService{
    private static final Logger LOGGER=LoggerFactory.getLogger(UserImpl.class);
    @CacheResult(cacheKeyMethod = "getCacheKey")
    @HystrixCommand(commandKey = "getUserCache")
    @Override
    public String getUserCache(Long id) {
        LOGGER.info("getUserCache id:{}",id);
        return "";
    }

    @Override
    @HystrixCommand
    @CacheRemove(commandKey = "getUserCache",cacheKeyMethod = "getCacheKey")
    public String removeCache(Long id) {
        LOGGER.info("removeCache id:{}",id);
        return "";
    }

    @Override
    public String getCacheKey(Long id) {
        return String.valueOf(id);
    }

    @Override
    @HystrixCollapser(batchMethod = "getUsersByIds",scope = com.netflix.hystrix.HystrixCollapser.Scope.GLOBAL)
    @HystrixProperty(name = "timerDelayInMilliseconds",value = "1000")
    public User getUserById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("-");
        LOGGER.info("getUserById id:{}",id);
        return user;
    }

    @Override
    @HystrixCommand
    public List<User> getUsersByIds(List<Long> ids) {
        LOGGER.info("getUsersByIds ids:{}",ids);
        ArrayList<User> users = new ArrayList<>();
        for (Long id:ids
             ) {
            User user = new User();
            user.setId(id);
            user.setName("--");
            users.add(user);
        }
        return users;
    }
}
