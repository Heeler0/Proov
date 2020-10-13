package com.example.proov.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;
import java.util.List;

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

    private List<ServiceObj> serviceObjList;
}
