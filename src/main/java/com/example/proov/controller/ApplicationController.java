package com.example.proov.controller;

import com.example.proov.model.Application;
import com.example.proov.model.ServiceObj;
import com.example.proov.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @GetMapping("/api/application")
    public List<Application> findAll() {
        return applicationService.findAll();
    }

    @PostMapping("/api/application")
    public Application saveApplication(@RequestBody Application application) {
        return applicationService.save(application);
    }
}
