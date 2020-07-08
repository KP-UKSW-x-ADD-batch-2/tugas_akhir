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
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import repositories.EmployeeRepository;
import services.EmployeeService;

/**
 *
 * @author Dhanuaji Pratama
 */
@Controller
public class EmployeeController {
    
    
    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmployeeRepository repository;

    @RequestMapping("")
    public String index(Model model) {
//        for (Employee employee : employeeService.getAll()) {
//            System.out.println(employee.getId()+" - "+employee.getName());
//        }
        model.addAttribute("employee", new Employee());
        model.addAttribute("employees", employeeService.getAll());
        return "index";
    }
    
    @PostMapping("insert")
    public String insert(Model model, @Validated Employee employee) {
        employeeService.insert(employee);
//        model.addAttribute("employee", new Employee());
        model.addAttribute("employees", employeeService.getAll());
        return "redirect:/";
    }
    
    @PostMapping("update")
    public String update(Model model, @Validated Employee employee) {
        employeeService.update(employee);
//        model.addAttribute("employee", new Employee());
        model.addAttribute("employees", employeeService.getAll());
        return "redirect:/";
    }
    
    @GetMapping("delete/{id}")
    public String delete(@PathVariable String id) {
        employeeService.delete(id);
        return "redirect:/";
    }
    
    @PostMapping("getById")
    public String getById(Model model, @Validated Employee id) {
        employeeService.hehe(id.getId());
        model.addAttribute("employee", new Employee());
        model.addAttribute("employees", employeeService.hehe(id.toString()));
        return "redirect:/";
    }
    
    
}
