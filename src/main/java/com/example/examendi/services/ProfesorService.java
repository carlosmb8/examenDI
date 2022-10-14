package com.example.examendi.services;

import org.springframework.stereotype.Service;

@Service("Profesor")
public class ProfesorService implements AdapterService {

    @Override
    public String muestraRol() {
        return "Hola soy un profesor";
    }
}
