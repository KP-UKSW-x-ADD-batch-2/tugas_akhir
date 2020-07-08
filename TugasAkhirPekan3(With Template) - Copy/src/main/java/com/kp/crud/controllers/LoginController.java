/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.crud.controllers;

import com.kp.crud.entities.Account;
import com.kp.crud.entities.Account;
import com.kp.crud.entities.Role;
import com.kp.crud.repositories.AccountRepository;
import com.kp.crud.repositories.RoleRepository;
import com.kp.crud.services.AccountService;
import com.kp.crud.services.AccountService;
import com.kp.crud.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tools.BCrypt;

/**
 *
 * @author Yosef Febrianes
 */
@Controller
public class LoginController {

    @Autowired
    AccountService accountService;

    @Autowired
    AccountRepository repository;

    @Autowired
    RoleService roleService;

    @Autowired
    RoleRepository roleRepository;

//    @RequestMapping("")
//    public String index(Model model) {
//        model.addAttribute("role", new Role());
//        model.addAttribute("roles", roleService.getAll());
//        System.out.println("gbu");
//        return "index";
//    }
    
    @PostMapping("findlogin")
    public String findLogin(Model model, @Validated Account id) {
        accountService.getById(id.getId());
        model.addAttribute("account", new Account());
        model.addAttribute("accounts", accountService.getById(id.toString()));
        return "redirect:/";
    }

//    @PostMapping("login")
//    public boolean login(Model model, @Validated String username, String password) {
//        Account acc = (Account) accountService.getByUsername(username);
//
//        if (acc != null && BCrypt.checkpw(password, acc.getPassword())) {
////        if (BCrypt.checkpw(password, acc.getPassword())) {
//            return true;
//        } else {
//            return false;
//        }
//    }

//    @RequestMapping("x")
//    public String index(Model model, @Validated String username, String password) {
//        model.addAttribute("role", new Role());
//        model.addAttribute("roles", roleService.getAll());
//        System.out.println("gbu");
//
//        Account acc = (Account) accountService.getByUsername(username);
//        
//        if (acc != null && BCrypt.checkpw(password, acc.getPassword())) {
////        if (BCrypt.checkpw(password, acc.getPassword())) {
//            return "index";
//        } else {
//            return "redirect";
//        }
//    }

}
