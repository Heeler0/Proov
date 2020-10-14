package com.example.proov.repository;

import com.example.proov.model.Application;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;
import java.util.Optional;

public interface ApplicationRepository extends ElasticsearchRepository<Application, String> {

    Application findByName(String name);

    Optional<Application> findById(String id);

}
