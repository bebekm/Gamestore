/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsni.gamestore.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Korisnik
 */
@Entity
public class User extends Entitet{

  
    
//    @NotNull(message = "Password can't be empty")
//    @NotEmpty(message = "Password can't be empty")
    private String username;
    private String pass;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
      public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    @Override
    public String toString() {
        if(getUsername()==null || getUsername().trim().isEmpty()){
            return"[Name isn't defined]";
        }

        return getUsername();
    }
    
    @ManyToMany
    private List<Game> games = new ArrayList<>();
    
    @ManyToMany
    private List<User> friendlists = new ArrayList<>();

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public List<User> getFriendlists() {
        return friendlists;
    }

    public void setFriendlists(List<User> friendlists) {
        this.friendlists = friendlists;
    }
    
    
    
}
