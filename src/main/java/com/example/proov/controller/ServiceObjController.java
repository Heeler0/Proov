package com.example.proov.controller;

import com.example.proov.model.Application;
import com.example.proov.model.ServiceObj;
import com.example.proov.service.ServiceObjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ServiceObjController {

    @Autowired
    private ServiceObjService serviceObjService;

    @GetMapping("/api/service")
    public Optional<Application> findApplication(@RequestParam String name) {
        return serviceObjService.findApplication(name);
    }

    @PostMapping("/api/service")
    public ServiceObj saveService(@RequestBody ServiceObj serviceObj) {
        return serviceObjService.save(serviceObj);
    }

    @GetMapping("api/service/all")
    public List<ServiceObj> findAll() {
        return serviceObjService.findAll();
    }
}