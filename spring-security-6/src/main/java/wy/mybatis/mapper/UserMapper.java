package wy.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import wy.mybatis.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
* @author 25427
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-07-18 17:43:29
* @Entity wy.mybatis.domain.User
*/
@Repository
public interface UserMapper {
    void add(@Param("user") User user);
    //查看权限
    ArrayList<String> queryAuthority(@Param("username") String username);
    //获取信息
    User queryByUsername(@Param("username") String username);
}




