/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.crud.services;

import com.kp.crud.entities.Employee;
import com.kp.crud.repositories.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dhanuaji Pratama
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public List<Employee> getAll() {
        return repository.findAll();
    }
    
    public List<Employee> employeeView() {
        return repository.employeeView();
    }

    public List<Employee> string(String keyword) {
        return repository.findAll();
    }

    public void insert(Employee r) {
        repository.save(r);
    }

    public void update(Employee r) {
        repository.save(r);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public Iterable<Employee> searchById(String id) {
        return repository.findAll();
    }

}
