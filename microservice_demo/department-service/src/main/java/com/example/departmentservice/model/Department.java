package com.example.departmentservice.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Department {
    private Long id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
