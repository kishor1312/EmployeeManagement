package com.ecti.em.controller;

import com.ecti.em.model.Employee;
import com.ecti.em.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeRestController {

    private EmployeeService employeeServiceImpl;

    public EmployeeRestController(EmployeeService employeeServiceImpl) {
        this.employeeServiceImpl = employeeServiceImpl;
    }

    @GetMapping
    public List<Employee> getListOfAllEmployees() {
        return employeeServiceImpl.getAllEmployees();
    }

    @GetMapping("/{empId}")
    public Employee getOneEmployee(@PathVariable("empId") String empId) {
        return employeeServiceImpl.getEmployee(empId);
    }

    @PostMapping
    public Employee registerEmployee(@RequestBody Employee employee) {
        return employeeServiceImpl.addEmployee(employee);
    }

    @PutMapping
    public Employee updateAnEmployee(@RequestBody Employee employee) throws Exception {
        return employeeServiceImpl.updateEmployee(employee);
    }

    @DeleteMapping("/{empId}")
    public String deleteEmployee(@PathVariable("empId") String empId) throws Exception {
        employeeServiceImpl.deleteEmployee(empId);
        return "Employee : "+empId+ " deleted successfully";
    }

}
