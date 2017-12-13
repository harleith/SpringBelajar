/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.controller;

import com.valensi.dao.ProductService;
import com.valensi.model.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")

public class ProductController {
    
    @Autowired
    ProductService ps;
    
    @RequestMapping(value = "/all")
    public String showAllCustomers(Model model) {
        List<Product> product = ps.findAll();
        model.addAttribute("product", product);
        return "product";
    }
    
    @RequestMapping(value = "/{customeriId")
    public String showOneCustomer(@PathVariable Integer customerId, Model model) {
        Product customer = ps.findById(customerId);
        model.addAttribute("customer", customer);
        return "customerdetail";
    }
}
