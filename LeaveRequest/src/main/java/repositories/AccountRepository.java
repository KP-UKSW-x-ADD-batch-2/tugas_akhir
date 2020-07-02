/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import entities.Account;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Dhanuaji Pratama
 */
public interface AccountRepository extends CrudRepository<Account, String>{
    
}
