package com.example.proov.repostitory;

import com.example.proov.model.Application;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ApplicationRepository extends ElasticsearchRepository<Application, String> {
}
