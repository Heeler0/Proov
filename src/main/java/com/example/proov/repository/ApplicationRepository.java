package com.example.proov.repository;

import com.example.proov.model.Application;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ApplicationRepository extends ElasticsearchRepository<Application, String> {

    List<Application> findAll();
}
