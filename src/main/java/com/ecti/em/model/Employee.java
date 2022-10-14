package com.ecti.em.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "emp_id")
    private String empId;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "emp_salary")
    private double empSalary;

    @Column(name = "emp_bonus")
    private double empBonus;

    @Column(name = "emp_password")
    private String empPassword;
}
