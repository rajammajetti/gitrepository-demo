package com.ibm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ibm.entity.Employee;
import com.ibm.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class DockerController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // ✅ Add Employee
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    // ✅ Get all Employees (optional but useful)
    @GetMapping("/all")
    public Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
