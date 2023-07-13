package wy.seataorderservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:王艺
 * @Project:learn
 * @File:MybaitsConfig
 * @Date:2023/7/12 12:49
 */
@Configuration
@MapperScan({"wy.seataorderservice.dao"})
public class MybaitsConfig {
}
