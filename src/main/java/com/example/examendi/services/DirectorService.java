package com.example.examendi.services;

import org.springframework.stereotype.Service;

@Service("Director")
public class DirectorService implements AdapterService {

    @Override
    public String muestraRol() {
        return "Soy un director";
    }
}
