package com.ecti.em.service;

import com.ecti.em.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    public Employee addEmployee(Employee e);
    public Employee updateEmployee(Employee e) throws Exception;
    public void deleteEmployee(String id) throws Exception;
    public Employee getEmployee(String id);
    public List<Employee> getAllEmployees();
}
