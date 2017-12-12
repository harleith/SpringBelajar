/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.controller;

import com.valensi.formbean.RegisterFormbean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/register")
public class RegistrationController {
   
    @RequestMapping() 
    public String registerForm(Model model) {
        RegisterFormbean registerBean = new RegisterFormbean();
        //registerBean.setLastName("Smith");
        model.addAttribute("registerBean", registerBean);
        return "registration";
    }
    
    @RequestMapping(value="/save") 
    public String saveRegistration(@ModelAttribute("registerBean") RegisterFormbean registerBean, 
            Model model) {
        System.out.println("User Firtname: " + registerBean.getFirstName());
        model.addAttribute("data", registerBean);
        return "successregistration";
    }
}
