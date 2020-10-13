package com.example.proov.service;

import com.example.proov.model.ServiceObj;
import com.example.proov.repository.ServiceObjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceObjService {

    @Autowired
    private ServiceObjRepository serviceObjRepository;

    public List<ServiceObj> findAll() {
        return serviceObjRepository.findAll();
    }

    public ServiceObj save(ServiceObj serviceObj) {

        return serviceObjRepository.save(serviceObj);
    }

}
