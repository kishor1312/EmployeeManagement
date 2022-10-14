package com.ecti.em.service;

import com.ecti.em.model.Employee;
import com.ecti.em.repo.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee addEmployee(Employee e) {
        return employeeRepository.save(e);
    }

    @Override
    public Employee updateEmployee(Employee e) throws Exception {
        Optional<Employee> empOptional = employeeRepository.findById(e.getEmpId());
        if(empOptional.isPresent()) {
            return employeeRepository.save(e);
        } else {
            throw new Exception("Record not found");
        }
    }

    @Override
    public void deleteEmployee(String id) throws Exception {
        Optional<Employee> empOptional = employeeRepository.findById(id);
        if(empOptional.isPresent()) {
            employeeRepository.delete(empOptional.get());
        } else {
            throw new Exception("Record not found");
        }
    }

    @Override
    public Employee getEmployee(String id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
