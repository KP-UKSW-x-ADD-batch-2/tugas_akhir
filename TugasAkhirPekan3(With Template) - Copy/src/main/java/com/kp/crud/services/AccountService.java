/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.crud.services;

import com.kp.crud.entities.Account;
import com.kp.crud.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dhanuaji Pratama
 */
@Service
public class AccountService {

    @Autowired
    AccountRepository repository;

//    @Autowired
//    AccountRepository2 repository2;
    public Iterable<Account> getAll() {//FIX
        return repository.findAll();
    }

    public Iterable<Account> string(String keyword) {//FIX
        return repository.findAll();
    }

//    public <S extends Account> S insert(S s){//FIX
//    return repository.save(s);
//    }
    public void insert(Account r) {//FIX
        repository.save(r);
    }

    public void update(Account r) {//FIX
        repository.save(r);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public Iterable<Account> getById(String id) {
        return repository.findAll();
    }

    public Iterable<Account> getByUsername(String username) {
        return repository.findAll();
    }

//    public AccountService(String username){
//        repository.findById(username);
//    }
    
//    public Account findByUsername(String username) {
//        return repository.findByUsename(username);
//    }

//    public UserDetails loadByUsername(String username) throws UsernameNotFoundException {
//        Account account = repository.findByUsename(username);
//        if (account == null) {
//            throw new UsernameNotFoundException("Invalid");
//        }
////        return new org.springframework.security.core.userdetails.User(account.getUsername(),account.getPassword());
//        return null;
//    }

}
