/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsni.gamestore;
import org.hibernate.Session;
import zavrsni.gamestore.util.HibernateUtil;
import zavrsni.gamestore.util.InitialFixtures;
import zavrsni.gamestore.view.Authorization;
import zavrsni.gamestore.view.SplashScreen;

/**
 *
 * @author Korisnik
 */
public class Start {
    
    public static void main(String[] args) {
        Session s = HibernateUtil.getSession();
        new SplashScreen().setVisible(true);
//        new Authorization().setVisible(true);
    }
    
}
