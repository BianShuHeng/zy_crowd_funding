package com.zhiyou100.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author BianGe
 * @ClassName RedisConfig
 * @Description // 使用Redis 实现session 共享
 * @create 2019/4/4 11:52
 * @Version 1.0
 **/
@Configuration
@EnableRedisHttpSession
public class RedisConfig {
}