package com.example.kuberntes.endpoint;

import com.example.kuberntes.service.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/properties")
public class RestEndpoint {

    @Autowired
    private Servicio servicio;

    @GetMapping
    public String getProperties(){
        return servicio.getProperties();
    }

}
