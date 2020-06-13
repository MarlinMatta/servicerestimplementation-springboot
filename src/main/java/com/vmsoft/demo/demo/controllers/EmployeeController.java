package com.vmsoft.demo.demo.controllers;

import com.vmsoft.demo.demo.utils.DataSource;
import com.vmsoft.demo.demo.models.Employee;
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
