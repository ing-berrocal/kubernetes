package com.example.kuberntes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndpoint {

    @GetMapping("/")
    public String getHello(){
        return "Hello";
    }

}
