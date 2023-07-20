package wy.mybatis.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import wy.mybatis.domain.User;
import wy.mybatis.mapper.UserMapper;
import wy.mybatis.service.UserService;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @Author:王艺
 * @Project:learn
 * @File:UserServiceImpl
 * @Date:2023/7/19 15:03
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public ArrayList<String> queryAuthority(String username) {
        ArrayList<String> authority = userMapper.queryAuthority(username);
        return authority;
    }

    @Override
    public User queryByName(String username) {
        return userMapper.queryByUsername(username);
    }
}
