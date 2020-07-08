/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.crud.services;

import com.kp.crud.entities.Request;
import com.kp.crud.repositories.RequestRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yosef Febrianes
 */
@Service
public class RequestService {

    @Autowired
    RequestRepository repository;

//    @Autowired
//    RequestRepository2 repository2;
    public Iterable<Request> getAll() {//FIX
        return repository.findAll();
    }

    public Iterable<Request> string(String keyword) {//FIX
        return repository.findAll();
    }

    public void insert(Request r) {//FIX
        repository.save(r);
    }

    public void update(Request r) {//FIX
        repository.save(r);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public Iterable<Request> getByUsername(String username) {
        return repository.findAll();
    }
    
    public List<Request> insertRequest(){
        return repository.insertRequest();
    }

}
