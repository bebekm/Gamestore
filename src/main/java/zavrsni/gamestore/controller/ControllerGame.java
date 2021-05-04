/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsni.gamestore.controller;

import java.util.List;
import zavrsni.gamestore.model.Game;

/**
 *
 * @author Korisnik
 */
public class ControllerGame extends Controller<Game> {
    
    public Game authorize (String username, char[] pass){
        
        Game g = (Game)session
                .createQuery("from Game g where g.username = :username")
                .setParameter("username", username)
                .getSingleResult();
        if (g == null){
            return null;
        } 
        return g;
    }

    @Override
    public List<Game> getData() {
        return session.createQuery("from Game").list();
    }

    @Override
    protected void controlCreate() {
        
    }

    @Override
    protected void controlUpdate() {
        
    }

    @Override
    protected void controlDelete() {
        
    }
    
}
