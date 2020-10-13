package com.example.proov.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Data
@Document(indexName = "service")
public class ServiceObj {

    @Id
    private String id;

    private String ServiceCode;

    private String name;

    private String type;

    private String subType;

    private String description;

    private Date lastModified;

    private Application application;

}
