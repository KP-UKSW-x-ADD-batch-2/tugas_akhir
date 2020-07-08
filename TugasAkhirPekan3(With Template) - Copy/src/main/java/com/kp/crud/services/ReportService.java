/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.crud.services;

import com.kp.crud.entities.Report;
import com.kp.crud.repositories.ReportRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dhanuaji Pratama
 */
@Service
public class ReportService {
    @Autowired
    ReportRepository reportRepository;
    
    public List<Report> reportView(){
        return reportRepository.showReport();
    }
}
