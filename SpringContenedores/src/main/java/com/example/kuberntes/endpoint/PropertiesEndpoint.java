package com.example.kuberntes.endpoint;

import com.example.kuberntes.service.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesEndpoint {

    @Autowired
    private Servicio servicio;

    @GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getHello(){

        return servicio.getMessage();
    }

}
