package com.example.proov.service;

import com.example.proov.exceptions.InvalidServiceException;
import com.example.proov.model.Application;
import com.example.proov.model.ServiceObj;
import com.example.proov.repository.ApplicationRepository;
import com.example.proov.repository.ServiceObjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
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
            throw new InvalidServiceException("Id already present");
        } else if (applicationRepository.findById(serviceObj.getAppId()).isEmpty()) {
            throw new InvalidServiceException("No application with that id found.");
        } else if (!Arrays.asList("REST", "SOAP").contains(serviceObj.getSubType())) {
            throw new InvalidServiceException("Wrong subtype of service.");
        } else if (!Arrays.asList("HTTP", "SAML", "SSH", "JDBC", "ODBC").contains(serviceObj.getType())) {
            throw new InvalidServiceException("Wrong type of service.");
        }

        serviceObj.setLastModified(new Date());
        return serviceObjRepository.save(serviceObj);
    }

    public List<ServiceObj> findAll() {
        return serviceObjRepository.findAll();
    }
}