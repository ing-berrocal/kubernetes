package com.example.kuberntes.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicio {

    @Value("${saludo.mensaje}")
    String saludo;

    public String getMessage(){
        return saludo;
    }

    public String getProperties(){

        StringBuilder sb = new StringBuilder();

        System.getProperties().forEach((o, o2) -> sb.append(String.format("</br>Key: %s, Value: %s\n",o,o2)));

        return sb.toString();
    }

    public String getEnvironment(){

        StringBuilder sb = new StringBuilder();

        System.getenv().forEach((o, o2) -> sb.append(String.format("Key: %s, Value: %s\n",o,o2)));
        return sb.toString();
    }
}
