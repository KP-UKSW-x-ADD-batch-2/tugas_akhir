/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.AccountRepository;

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

    public Iterable<Account> getByUsername(String username) {
        return repository.findAll();
    }

}
