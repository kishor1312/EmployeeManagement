package com.ecti.em.repo;

import com.ecti.em.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

    @Query("select case when count(e) > 0 then true else false end " +
            "from Employee e where e.empName = :empName")
    Boolean isEmployeeExistsByName(String empName);
}
