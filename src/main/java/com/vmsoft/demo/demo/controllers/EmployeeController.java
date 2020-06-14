package com.vmsoft.demo.demo.controllers;

import com.vmsoft.demo.demo.utils.DataSource;
import com.vmsoft.demo.demo.models.Employee;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Employee getEmployee(@RequestParam int id) {
        return dataSource.getEmployees().stream().filter(it -> it.getId() == id).findFirst().orElse(  null);
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String createEmployee(@RequestBody Employee employee) {
       dataSource.getEmployees().add(employee);
       return "OK";
    }
}
