package com.example.springapplication.service;

import com.example.springapplication.model.Employee;
import com.example.springapplication.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeService {

    @Resource
    private EmployeeRepository employeeRepository;

    public Employee save(final Employee employee) {
        return employeeRepository.save(employee);
    }
}
