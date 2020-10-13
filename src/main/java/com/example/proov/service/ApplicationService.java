package com.example.proov.service;

import com.example.proov.model.Application;
import com.example.proov.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    public List<Application> findAll() {
        return applicationRepository.findAll();
    }

    public Application save(Application application) {
        return applicationRepository.save(application);
    }
}
