package com.example.examendi.services;

import org.springframework.stereotype.Service;

@Service("Estudiante")
public class EstudianteService implements AdapterService {

    @Override
    public String muestraRol() {
        return "Hola soy el un estudiante";
    }
}
