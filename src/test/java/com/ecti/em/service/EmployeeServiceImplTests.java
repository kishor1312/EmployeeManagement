package com.ecti.em.service;

import com.ecti.em.controller.EmployeeRestController;
import com.ecti.em.model.Employee;
import com.ecti.em.repo.EmployeeRepository;
import org.aspectj.lang.annotation.Before;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@SpringBootTest
public class EmployeeServiceImplTests {

    private EmployeeService employeeServiceImpl;

    @Mock
    private EmployeeRepository employeeRepository;

    @BeforeEach
    void setUp() {
        this.employeeServiceImpl = new EmployeeServiceImpl(employeeRepository);
    }

    @Test
    void testUpdateEmployeeSuccess() throws Exception {
        // old object in db
        Employee e1 = new Employee("1", "kishor", 10000, 100, "1234");

        // new object
        Employee e2 = new Employee("1", "kishor", 20000, 200, "1234");

        // pass the new object to update method
        when(employeeRepository.findById(anyString())).thenReturn(Optional.of(e1));
        when(employeeRepository.save(any())).thenReturn(e2);
        Employee emp = employeeServiceImpl.updateEmployee(e2);

        // get the returned result object
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(emp);

        Assertions.assertThat(emp.getEmpSalary()).isEqualTo(e2.getEmpSalary());
    }
}
