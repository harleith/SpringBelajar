/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.dao;

import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserService {
    
    
    @PersistenceUnit
    EntityManagerFactory emf;
        
    private EntityManager em;

    @Transactional
    public void saveUser(User user) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }

    public User findByUsername(String username) {
        User user = new User();
        try {
            em = emf.createEntityManager();
            Query query = em.createQuery("Select u from User u where u.username = :username");
            query.setParameter("username", username);
            user = (User) query.getSingleResult();
        } catch (NoResultException nre) {
            java.util.logging.Logger.getLogger(username).log(Level.SEVERE, username, nre);
        }
        return user;
    }
    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }
    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }
    
}
