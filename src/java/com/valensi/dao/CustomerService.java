/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.dao;

import com.valensi.model.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
@Transactional

public class CustomerService {

    @PersistenceContext
    private EntityManager em;

    public CustomerService() {

    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Transactional
    public void register(Customer cus) {
        // Save employee
        this.em.persist(cus);
    }

    public List<Customer> findAll() {
        List<Customer> customers;
        customers = this.em.createNamedQuery("Customer.findAll").getResultList();
        return customers;
    }

    public Customer findById(Integer customerId) {
        return em.find(Customer.class, customerId);
    }

}
