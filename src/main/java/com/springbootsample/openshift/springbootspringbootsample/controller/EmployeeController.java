package com.springbootsample.openshift.springbootspringbootsample.controller;

import com.springbootsample.openshift.springbootspringbootsample.model.Employee;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping("/")
    public List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Jhomar", 24));
        employees.add(new Employee(2, "Alglen", 25));
        employees.add(new Employee(3, "Galano", 26));


        return employees;
    }

}
