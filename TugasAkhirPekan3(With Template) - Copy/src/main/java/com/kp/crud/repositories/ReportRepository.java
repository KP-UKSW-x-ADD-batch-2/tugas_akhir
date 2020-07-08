/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.crud.repositories;

import com.kp.crud.entities.Report;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dhanuaji Pratama
 */
@Repository
public interface ReportRepository extends JpaRepository<Report, String>{
    
    @Modifying
    @Query(value = "SELECT * FROM Report r", nativeQuery = true)
    public List<Report> showReport();
    
}
