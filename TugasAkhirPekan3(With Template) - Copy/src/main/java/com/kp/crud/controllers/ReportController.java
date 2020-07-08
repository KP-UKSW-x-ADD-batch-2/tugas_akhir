/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.crud.controllers;

import com.kp.crud.entities.Report;
import com.kp.crud.entities.Request;
import com.kp.crud.services.ReportService;
import com.kp.crud.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Dhanuaji Pratama
 */
@Controller
public class ReportController {
    @Autowired
    ReportService reportService;
    
    @Autowired
    RequestService requestService;
    
    @RequestMapping("report")
    public String reportView(Model model){
        model.addAttribute("report", new Report());
        model.addAttribute("reports", reportService.reportView());
        return "report";
    }
    
//    @RequestMapping()
//    public String showRequest(Model model){
//        model.addAttribute("request", new Request());
//        model.addAttribute("requests", requestService.getAll());
//        return "redirect:/";
//    }
}
