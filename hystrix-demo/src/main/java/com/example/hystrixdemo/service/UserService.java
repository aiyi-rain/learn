package com.example.hystrixdemo.service;

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
}
