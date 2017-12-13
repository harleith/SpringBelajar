/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.controller;

import com.valensi.dao.CustomerService;
import com.valensi.model.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")

public class CustomerController {

    @Autowired
    CustomerService cs;

    @RequestMapping(value = "/all")
    public String showAllCustomers(Model model) {
        List<Customer> customers = cs.findAll();
        model.addAttribute("customers", customers);
        return "customers";
    }

    @RequestMapping(value = "/{customeriId")
    public String showOneCustomer(@PathVariable Integer customerId, Model model) {
        Customer customer = cs.findById(customerId);
        model.addAttribute("customer", customer);
        return "customerdetail";
    }
    
    
}
