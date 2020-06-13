package com.vmsoft.singa.demo.controllers;

import com.vmsoft.singa.demo.models.Employee;
import com.vmsoft.singa.demo.utils.DataSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class EmployeeController {

    private DataSource dataSource = new DataSource();

    @RequestMapping(value = "/up", method = RequestMethod.GET)
    public String up() {
        return "Y";
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getEmployees() {
        return dataSource.getEmployees();
    }
}
