/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsni.gamestore.util;

import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;
import zavrsni.gamestore.model.User;
import zavrsni.gamestore.model.Game;

/**
 *
 * @author Korisnik
 */
public class InitialFixtures {
    
    public static void main(String[] args) {
        Session s = HibernateUtil.getSession();
        s.beginTransaction();
        
        User a1 = new User();
        a1.setUsername("User1");
        a1.setPass(BCrypt.hashpw("User1", BCrypt.gensalt()));
        s.save(a1);
        
        User a2 = new User();
        a2.setUsername("User2");
        a2.setPass(BCrypt.hashpw("User2", BCrypt.gensalt()));
        s.save(a2);
        
        User a3 = new User();
        a3.setUsername("User3");
        a3.setPass(BCrypt.hashpw("User3", BCrypt.gensalt()));
        s.save(a3);
        
        User a4 = new User();
        a4.setUsername("User4");
        a4.setPass(BCrypt.hashpw("User4", BCrypt.gensalt()));
        s.save(a4);
        
        Game g1 = new Game();
        g1.setName("Minecraft");
        g1.setReleaseDate("2011-11-18");
        g1.setPublisher("Mojang");
        g1.setRating("E10+");
        g1.setPrice("23.95");
        s.save(g1);
        
        Game g2 = new Game();
        g2.setName("Counter Strike: Global Offensive");
        g2.setReleaseDate("2012-08-21");
        g2.setPublisher("Valve");
        g2.setRating("M17+");
        g2.setPrice("0.0");
        s.save(g2);
        
        Game g3 = new Game();
        g3.setName("Rainbow Six: Siege");
        g3.setReleaseDate("2015-12-01");
        g3.setPublisher("Ubisoft");
        g3.setRating("M17+");
        g3.setPrice("19.99");
        s.save(g3);
        
        Game g4 = new Game();
        g4.setName("The Witcher 3: Wild Hunt");
        g4.setReleaseDate("2015-05-18");
        g4.setPublisher("CD Projekt RED");
        g4.setRating("M17+");
        g4.setPrice("29.99");
        s.save(g4);
        
        s.getTransaction().commit();
    }
    
}
