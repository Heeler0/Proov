package com.example.proov.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Data
@Document(indexName = "application")
public class Application {

    @Id
    private String id;

    private String name;

    private String appGroup;

    private String appType;

    private String description;

    private int appCost;

    private Date lastModified;

}
