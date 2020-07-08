/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.crud.controllers;

import com.kp.crud.repositories.EmployeeRepository;
import com.kp.crud.services.EmployeeService;
import javafx.scene.layout.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Yosef Febrianes
 */
@Controller
public class DashboardController {
    
    
    @Autowired
    EmployeeService regionService;

    @Autowired
    EmployeeRepository repository;

    @RequestMapping("dashboard")
    public String index(Model model) {
//        for (Region region : regionService.getAll()) {
//            System.out.println(region.getId()+" - "+region.getName());
//        }
        model.addAttribute("region", new Region());
        model.addAttribute("regions", regionService.getAll());
        return "dashboard";
    }

}
