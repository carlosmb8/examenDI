package com.example.examendi;

import com.example.examendi.services.AdapterService;
import org.springframework.stereotype.Service;

@Service
public interface ServiceRegistry {
    public AdapterService llamaServicio(String nombreServicio);
}
