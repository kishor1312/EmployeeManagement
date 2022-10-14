package com.ecti.em.repo;

import com.ecti.em.model.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class EmployeeRepositoryTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void testIsEmployeeExistsByNameSuccess() {
        Employee e1 = new Employee("1", "Nilesh", 10000, 100, "npass");
        employeeRepository.save(e1);
        boolean result = employeeRepository.isEmployeeExistsByName("Nilesh");
        assertThat(result).isTrue();
    }

    /*@Test
    void testIsEmployeeExistsByNameFailed() {
        Employee e1 = new Employee("1", "Nilesh", 10000, 100, "npass");
        employeeRepository.save(e1);
        boolean result = employeeRepository.isEmployeeExistsByName("Santosh");
        assertThat(result).isTrue();
    }*/

   /* @BeforeEach
    void setUp() {
        System.out.println("in before each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("in tear down");
        employeeRepository.deleteAll();
    }*/
}
