package com.example.proov.controller;

import com.example.proov.model.ServiceObj;
import com.example.proov.service.ServiceObjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceObjController {

    @Autowired
    private ServiceObjService serviceObjService;

    @GetMapping("/api/service")
    public List<ServiceObj> findAll() {
        return serviceObjService.findAll();
    }

    @PostMapping("/api/service")
    public ServiceObj saveService() {
        return null;
    }
}
