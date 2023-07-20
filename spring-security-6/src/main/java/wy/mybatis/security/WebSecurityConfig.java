package wy.mybatis.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import wy.mybatis.domain.User;

import javax.annotation.Resource;

/**
 * @Author:王艺
 * @Project:learn
 * @File:WebSecurityConfig
 * @Date:2023/7/19 16:26
 */
@EnableWebSecurity
@EnableMethodSecurity
public class WebSecurityConfig  {
    @Resource
    private SecurityDetailsServiceImpl service;
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public UserDetails userDetails(){

        return SecurityUser.builder().build();
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth->{
                    auth.anyRequest().authenticated();
                })
                .formLogin(conf->{
                    conf.permitAll(true);
                })
                .csrf(AbstractHttpConfigurer::disable)
                .build();
    }

}
