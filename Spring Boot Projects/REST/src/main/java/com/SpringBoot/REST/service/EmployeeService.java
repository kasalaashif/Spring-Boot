package com.SpringBoot.REST.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.REST.entity.Employee;
import com.SpringBoot.REST.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    
    // Create
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    // Read
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }
    
    // Update
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    // Delete
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
} 