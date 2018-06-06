package com.jiong.encounter.config.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;


/**
 * @Author: JiongZhu
 * @Description:
 * @Date: Created in 22:29 2018/6/4
 * @Modified By:
 */
@Configuration
public class RedisConfig extends CachingConfigurerSupport {

    private final
    RedisConnectionFactory redisConnectionFactory;

    @Autowired
    public RedisConfig(RedisConnectionFactory redisConnectionFactory) {
        this.redisConnectionFactory = redisConnectionFactory;
    }

    @Bean
    StringRedisTemplate template() {
        return new StringRedisTemplate(redisConnectionFactory);
    }

    @Bean
    @Override
    public KeyGenerator keyGenerator() {
        return (target, method, params) -> {
            StringBuilder sb = new StringBuilder();//格式化缓存key字符串
            sb.append(target.getClass().getName());//追加类名
            sb.append(method.getName());//追加方法名
            for(Object obj : params){//遍历参数并且追加
                sb.append(obj.toString());
            }
            return sb.toString();
        };
    }
}
