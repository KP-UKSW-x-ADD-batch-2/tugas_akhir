/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.crud.repositories;

import com.kp.crud.entities.Employee;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dhanuaji Pratama
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

//    @Modifying
    @Query(value = "SELECT `id`, `name`, `email`, `phone_number`, `leave_quota`, `manager_id`, `is_deleted` FROM `employees` WHERE `is_deleted`= \"0\"", nativeQuery = true)
    public List<Employee> employeeView();
//    @Query(value = "SELECT name, ")
    
    @Query(value = "SELECT `id`, `name`, `leave_quota`", nativeQuery = true)
    public List<Employee> employeeViewManager();
}

//SELECT * FROM employee e
//SELECT e.id, e.name, e.email, e.phone_number, e.leave_quota, e.manager_id FROM employees e WHERE e.is_deleted = 0
