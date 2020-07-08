/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import repositories.EmployeeRepository;
import services.EmployeeService;

/**
 *
 * @author Yosef Febrianes
 */
@Controller
public class DashboardController {
    
    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmployeeRepository repository;

//    @GetMapping(value="/dashboard")
    @RequestMapping(value="/dashboard",method=RequestMethod.GET)
    public String dashboard(Model model) {

//        model.addAttribute("employee", new Employee());
//        model.addAttribute("employees", employeeService.getAll());
        System.out.println("dashboard");
        return "/dashboard";
    }
    
}