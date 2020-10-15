package com.example.proov.controller;

import com.example.proov.model.Application;
import com.example.proov.model.ServiceObj;
import com.example.proov.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @GetMapping("/api/application/all")
    public List<Application> findAll() {
        return applicationService.findAll();
    }

    @GetMapping("/api/application")
    public List<ServiceObj> findAllServices(@RequestParam String name) {
        return applicationService.findAllServices(name);
    }

    @PostMapping("/api/application")
    public Application saveApplication(@RequestBody Application application) {
        return applicationService.save(application);
    }
}
