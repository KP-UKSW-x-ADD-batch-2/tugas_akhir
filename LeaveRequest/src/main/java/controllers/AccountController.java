/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import repositories.AccountRepository;
import services.AccountService;
import tools.BCrypt;

/**
 *
 * @author Dhanuaji Pratama
 */
@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @Autowired
    AccountRepository repository;

    @RequestMapping("")
    public String index(Model model) {
//        for (Account account : accountService.getAll()) {
//            System.out.println(account.getId()+" - "+account.getName());
//        }
        model.addAttribute("account", new Account());
        model.addAttribute("accounts", accountService.getAll());
        return "index";
    }

    @PostMapping("insert")
    public String insert(Model model, @Validated Account account) {
        accountService.insert(account);
//        model.addAttribute("account", new Account());
        model.addAttribute("accounts", accountService.getAll());
        return "redirect:/";
    }

    @PostMapping("getById")
    public String getById(Model model, @Validated Account id) {
        accountService.getByUsername(id.getId());
        model.addAttribute("account", new Account());
        model.addAttribute("accounts", accountService.getByUsername(id.toString()));
        return "redirect:/";
    }
    
//    @PostMapping("getByUsername")
//    public boolean login(Model model, @Validated String password, String username) {
//        Account acc = (Account) accountService.getByUsername(username);
//        
//        if (acc != null && BCrypt.checkpw(password, acc.getPassword())) {
////        if (BCrypt.checkpw(password, acc.getPassword())) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    @PostMapping("getByUsername")
    public String login(Model model, @Validated String password, String username) {
        Account acc = (Account) accountService.getByUsername(username);
        
        if (acc != null && BCrypt.checkpw(password, acc.getPassword())) {
//        if (BCrypt.checkpw(password, acc.getPassword())) {
        return "dashboard";
        } else {
        return "dashboard";
        }
    }
}
