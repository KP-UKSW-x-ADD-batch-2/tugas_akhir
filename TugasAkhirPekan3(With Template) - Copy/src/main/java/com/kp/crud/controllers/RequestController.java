/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.crud.controllers;

import com.kp.crud.entities.Request;
import com.kp.crud.repositories.RequestRepository;
import com.kp.crud.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Yosef Febrianes
 */
@Controller
public class RequestController {
    
    @Autowired
    RequestService requestService;

    @RequestMapping("request")
    public String request(Model model) {

        return "request";
    }
    
    @PostMapping("insert")
    public String insert(Model model, @Validated Request request) {
        model.addAttribute("req", new Request());
        model.addAttribute("request", requestService.insertRequest());
        model.addAttribute("requests", requestService.getAll());
        return "request";
    }
}