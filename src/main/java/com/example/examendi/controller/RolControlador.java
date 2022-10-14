package com.example.examendi.controller;

import com.example.examendi.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RolControlador {
    @Autowired
    private ServiceRegistry serviceRegistry;

    @GetMapping("{rol}")
    public String processGet(@PathVariable String rol) {
        return serviceRegistry.llamaServicio(rol).muestraRol();
    }
}
