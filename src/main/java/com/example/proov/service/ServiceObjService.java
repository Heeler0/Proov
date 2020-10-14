
package com.example.proov.service;

import com.example.proov.model.Application;
import com.example.proov.model.ServiceObj;
import com.example.proov.repository.ApplicationRepository;
import com.example.proov.repository.ServiceObjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class ServiceObjService {

    @Autowired
    private ServiceObjRepository serviceObjRepository;

    @Autowired
    private ApplicationRepository applicationRepository;

    public Optional<Application> findApplication(String name) {
        ServiceObj serviceObj = serviceObjRepository.findByName(name);
        if (serviceObj == null) {
            return Optional.empty();
        }
        return applicationRepository.findById(serviceObj.getAppId());
    }

    public ServiceObj save(ServiceObj serviceObj) {
        if (serviceObj.getId() != null) {
            throw new
        } else if () {

        }
        serviceObj.setLastModified(new Date());
        return serviceObjRepository.save(serviceObj);
    }

}