package com.SpringBoot.REST.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.REST.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
} 