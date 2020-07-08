/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.crud.repositories;

import com.kp.crud.entities.AccountRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Dhanuaji Pratama
 */
public interface AccountRoleRepository extends JpaRepository<AccountRole, String>{
    
}
