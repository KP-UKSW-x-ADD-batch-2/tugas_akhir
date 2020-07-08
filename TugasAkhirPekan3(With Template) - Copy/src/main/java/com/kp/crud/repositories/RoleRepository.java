/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.crud.repositories;

import com.kp.crud.entities.Role;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Dhanuaji Pratama
 */
public interface RoleRepository extends CrudRepository<Role, String>{
    
}
