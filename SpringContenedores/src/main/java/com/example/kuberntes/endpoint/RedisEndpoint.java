package com.example.kuberntes.endpoint;

import com.example.kuberntes.service.RedisTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/redis")
public class RedisEndpoint {

    @Autowired
    private RedisTestService servicio;

    @GetMapping(value = "/{key}",produces = MediaType.TEXT_PLAIN_VALUE)
    public String existList(@PathVariable("key") String key){
        return servicio.existKey(key).toString();
    }

    @PostMapping(value = "/{key}",produces = MediaType.TEXT_PLAIN_VALUE)
    public String add(@PathVariable("key") String key, @RequestBody List<String> listElements){
        return servicio.addElements(key,listElements).toString();
    }

}
