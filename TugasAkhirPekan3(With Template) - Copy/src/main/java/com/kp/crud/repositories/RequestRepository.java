/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.crud.repositories;

import com.kp.crud.entities.Request;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Yosef Febrianes
 */
@Repository
public interface RequestRepository extends JpaRepository<Request, String>{
    
    @Modifying
    @Query(value = "INSERT INTO `request`(`id`, `requester`, `type`, `current_status`, `total`, `start`, "
            + "`end`, `reason`)"
            + "VALUES (?,?,?,?,?,?,?,?)", 
            nativeQuery = true)
    public List<Request> insertRequest();
}
