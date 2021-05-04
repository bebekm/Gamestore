/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsni.gamestore.controller;

import java.util.List;
import org.mindrot.jbcrypt.BCrypt;
import zavrsni.gamestore.model.User;

/**
 *
 * @author Korisnik
 */
public class ControllerUser extends Controller<User> {
    public User authorize (String username, char[] pass){
        
        User a = (User)session
                .createQuery("from User u where u.username = :username")
                .setParameter("username", username)
                .getSingleResult();
        if (a == null){
            return null;
        }     
        return BCrypt.checkpw(new String(pass),a.getPass()) ? a:null;
    }

    @Override
    public List<User> getData() {
        return session.createQuery("from User").list();
    }

    @Override
    protected void controlDelete() {
    }

    @Override
    protected void controlCreate() {
    }

    @Override
    protected void controlUpdate() {
        controlCreate();
    }
}
