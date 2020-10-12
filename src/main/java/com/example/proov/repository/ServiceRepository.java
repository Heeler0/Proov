package com.example.proov.repository;

import com.example.proov.model.Service;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ServiceRepository extends ElasticsearchRepository<Service, String> {
}
