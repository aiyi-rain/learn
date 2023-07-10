package com.example.hystrixdemo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheRemove;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

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
}
