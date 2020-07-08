/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.EmployeeRepository;

/**
 *
 * @author Dhanuaji Pratama
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

//    @Autowired
//    EmployeeRepository2 repository2;
    public Iterable<Employee> getAll() {//FIX
        return repository.findAll();
    }

    public Iterable<Employee> string(String keyword) {//FIX
        return repository.findAll();
    }

//    public <S extends Employee> S insert(S s){//FIX
//    return repository.save(s);
//    }
    public void insert(Employee r) {//FIX
        repository.save(r);
    }

    public void update(Employee r) {//FIX
        repository.save(r);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public Iterable<Employee> hehe(String id) {
        return repository.findAll();
    }

}
