/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.crud.services;

import com.kp.crud.entities.Role;
import com.kp.crud.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dhanuaji Pratama
 */
@Service
public class RoleService {

    @Autowired
    RoleRepository repository;

//    @Autowired
//    RoleRepository2 repository2;
    public Iterable<Role> getAll() {//FIX
        return repository.findAll();
    }

    public Iterable<Role> string(String keyword) {//FIX
        return repository.findAll();
    }

//    public <S extends Role> S insert(S s){//FIX
//    return repository.save(s);
//    }
    public void insert(Role r) {//FIX
        repository.save(r);
    }

    public void update(Role r) {//FIX
        repository.save(r);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public Iterable<Role> getById(String id) {
        return repository.findAll();
    }

    public Iterable<Role> getByUsername(String username) {
        return repository.findAll();
    }

//    public Role findByUsername(String username) {
//        return repository.findByUsename(username);
//    }

//    public UserDetails loadByUsername(String username) throws UsernameNotFoundException {
//        Role role = repository.findByUsename(username);
//        if (role == null) {
//            throw new UsernameNotFoundException("Invalid");
//        }
////        return new org.springframework.security.core.userdetails.User(role.getUsername(),role.getPassword());
//        return null;
//    }

}
