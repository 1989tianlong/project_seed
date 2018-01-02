package com.arch.power.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by jh on 2018-01-02.
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {

}
