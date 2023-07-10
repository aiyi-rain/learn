package com.example.hystrixdemo.service;

import com.example.hystrixdemo.entity.User;

import java.util.List;

/**
 * @Author:王艺
 * @Project:learn
 * @File:UserService
 * @Date:2023/7/10 13:20
 */
public interface UserService {
    String getUserCache(Long id);
    String getCacheKey(Long id);
    String removeCache(Long id);
    User getUserById(Long id);
    List<User> getUsersByIds(List<Long> ids);
}
