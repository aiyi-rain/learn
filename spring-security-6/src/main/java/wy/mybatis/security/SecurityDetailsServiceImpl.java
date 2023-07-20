package wy.mybatis.security;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import wy.mybatis.service.UserService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:王艺
 * @Project:learn
 * @File:securityDetailsServiceImpl
 * @Date:2023/7/19 16:17
 */
@Service
public class SecurityDetailsServiceImpl implements UserDetailsService {
    @Resource
    private UserService userService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (userService.queryByName(username)==null){
            throw new UsernameNotFoundException("该用户不存在");
        }
//        SecurityUser securityUser = new SecurityUser(userService.queryByName(username));
        SecurityUser securityUser = SecurityUser.builder().user(userService.queryByName(username)).build();
        ArrayList<String> authority = userService.queryAuthority(username);
        List<SimpleGrantedAuthority> list=new ArrayList<>();
        for (String s:authority
             ) {
            SimpleGrantedAuthority grantedAuthority = new SimpleGrantedAuthority(s);
            list.add(grantedAuthority);
        }
        securityUser.setList(list);
        return securityUser;
    }
}
