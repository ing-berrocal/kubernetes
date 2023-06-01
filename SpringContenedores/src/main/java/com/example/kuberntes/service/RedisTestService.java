package com.example.kuberntes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedisTestService {

    @Autowired
    private RedisTemplate<String, List<String>> template;

    public Boolean existKey(String key){

        Boolean aBoolean = template.hasKey(key);

        return aBoolean;
    }

    public Long addElements(String key,List<String> elements){

        Long numElements = template.opsForList().leftPushAll(key,elements);

        return numElements;
    }
}
