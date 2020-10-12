package com.example.proov.model;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "application_service", type = "service")
public class Service {
}
