package com.example.proov.repostitory;

import com.example.proov.model.Service;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ServiceRepository extends ElasticsearchRepository<Service, String> {
}
