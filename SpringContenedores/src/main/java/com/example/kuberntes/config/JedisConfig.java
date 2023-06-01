package com.example.kuberntes.config;

import com.example.kuberntes.config.properties.ConfigPropertiesRedis;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

@Configuration
public class JedisConfig {


    @Bean
    public LettuceConnectionFactory redisConnectionFactory(ConfigPropertiesRedis configPropertiesRedis) {

        return new LettuceConnectionFactory(new RedisStandaloneConfiguration(configPropertiesRedis.getHost(),
                configPropertiesRedis.getPort()));
    }

    @Bean
    public RedisTemplate<String, List<String>> redisTemplateList(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, List<String>> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }
}
