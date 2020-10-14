package com.example.proov.repository;

import com.example.proov.model.ServiceObj;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ServiceObjRepository extends ElasticsearchRepository<ServiceObj, String> {

    List<ServiceObj> findByAppId(String appId);

    ServiceObj findByName(String name);
}
