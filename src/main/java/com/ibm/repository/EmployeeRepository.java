package com.ibm.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
