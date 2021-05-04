/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsni.gamestore.controller;

import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.hibernate.Session;
import zavrsni.gamestore.model.Entitet;
import zavrsni.gamestore.util.GamestoreException;
import zavrsni.gamestore.util.HibernateUtil;
import zavrsni.gamestore.view.Application;

/**
 *
 * @author Korisnik
 */
public abstract class Controller<T extends Entitet>  {
    
    protected T entitet;
    protected Session session;
    protected Validator validator;
    
    public abstract List<T> getData();
    protected abstract void controlCreate()throws GamestoreException;
    protected abstract void controlUpdate()throws GamestoreException;
    protected abstract void controlDelete()throws GamestoreException;   
    
    
    
    public T create() throws GamestoreException{
        control();
        controlCreate();
        save();
        return this.entitet;
    }
    
    public T update() throws GamestoreException{
        control();
        controlUpdate();
        save();
        return this.entitet;
    }
    
    public boolean delete() throws GamestoreException{
        controlDelete();
        session.beginTransaction();
        session.delete(this.entitet);
        session.getTransaction().commit();
        return true;
    }
     
    private void save(){
        session.beginTransaction();
        session.save(this.entitet);
        session.getTransaction().commit();      
    }
    
    protected void control() throws GamestoreException{
        
        Set<ConstraintViolation<T>> constraintViolations 
                = validator.validate(this.entitet);
         
         if(constraintViolations.size()>0){
             StringBuilder sb=new StringBuilder();
             for (ConstraintViolation<T> violation : constraintViolations) {
                 sb.append(violation.getMessage());
                 sb.append(", ");
             }
            throw new GamestoreException(sb.toString());
        }
    }
    
    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
    
    
    public Controller() {
        this.session=HibernateUtil.getSession();
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        this.validator=factory.getValidator();
    }
    
    public Controller(T entitet){
        this();
        this.entitet = entitet;
    }
}
