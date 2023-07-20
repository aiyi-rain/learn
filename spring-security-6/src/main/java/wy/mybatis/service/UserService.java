package wy.mybatis.service;

import wy.mybatis.domain.User;

import java.util.ArrayList;

/**
 * @Author:王艺
 * @Project:learn
 * @File:UserService
 * @Date:2023/7/19 15:02
 */
public interface UserService {
    //根据用户名获取用户权限
    ArrayList<String> queryAuthority(String username);
    //根据用户名获取用户信息
    User queryByName(String username);
}
