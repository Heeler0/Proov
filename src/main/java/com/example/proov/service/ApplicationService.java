package com.example.proov.service;

import com.example.proov.model.Application;
import com.example.proov.model.ServiceObj;
import com.example.proov.repository.ApplicationRepository;
import com.example.proov.repository.ServiceObjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Autowired
    private ServiceObjRepository serviceObjRepository;

    public List<ServiceObj> findAllServices(String name) {
        Application application = applicationRepository.findByName(name);
        if (application == null) {
            return null;
        }
        return serviceObjRepository.findByAppId(application.getId());
    }

    public Application save(Application application) {
        application.setLastModified(new Date());
        return applicationRepository.save(application);
    }
}
