package wy.mybatis;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import wy.mybatis.domain.User;
import wy.mybatis.mapper.UserMapper;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@SpringBootTest
@Slf4j
class MybatisApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Resource
    private BCryptPasswordEncoder passwordEncoder;
    @Test
    void contextLoads() {
        User user1 = User.builder().username("王艺").password(passwordEncoder.encode("123456")).enable(1).roleid(1).build();
        User user2 = User.builder().username("李四").password(passwordEncoder.encode("123456")).enable(1).roleid(2).build();
        User user3 = User.builder().username("赵二").password(passwordEncoder.encode("123456")).enable(1).roleid(3).build();
        userMapper.add(user1);
        userMapper.add(user2);
        userMapper.add(user3);
    }

    @Test
    void yy() {
        for (String s : userMapper.queryAuthority("赵二")) {
            log.info(s);
        }

    }
    @Test
    void lo(){
        User user = userMapper.queryByUsername("王艺");
        log.info(user.toString());
    }

}
