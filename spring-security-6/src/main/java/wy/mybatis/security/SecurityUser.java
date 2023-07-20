package wy.mybatis.security;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import wy.mybatis.domain.User;

import java.util.Collection;
import java.util.List;

/**
 * @Author:王艺
 * @Project:learn
 * @File:SecurityUser
 * @Date:2023/7/19 16:05
 */
@Data
@Builder
public class SecurityUser implements UserDetails {
    private final User user;
    private List<SimpleGrantedAuthority> list;

    public void setList(List<SimpleGrantedAuthority> list) {
        this.list = list;
    }

//    public SecurityUser(User user) {
//        this.user = user;
//    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //设置权限
        return list;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return (user.getEnable()==1);
    }
}
