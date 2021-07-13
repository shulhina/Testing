package com.example.hrspringbootwebtest.controller;

import com.example.hrspringbootwebtest.model.Employee;
import com.example.hrspringbootwebtest.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestEmployeeRESTController {

    EmployeeRepository em;

    @Autowired

    TestEmployeeRESTController(EmployeeRepository em){
        this.em = em;
    }

    @PostMapping
    public void createEmployeeAPI(@PathVariable int employeeId){
        em.save(new Employee((long)1, "Hello", "world", "test"));
    }

}
