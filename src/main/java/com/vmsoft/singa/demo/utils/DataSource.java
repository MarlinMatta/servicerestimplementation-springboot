package com.vmsoft.singa.demo.utils;

import com.vmsoft.singa.demo.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    private List<Employee> employees = new ArrayList<>();

    public DataSource() {
        employees.add(new Employee(1, "Marlin", "Matta", 'A'));
        employees.add(new Employee(2, "Yelson", "Veras", 'B'));
        employees.add(new Employee(3, "Nicole", "Jorge", 'A'));

    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
