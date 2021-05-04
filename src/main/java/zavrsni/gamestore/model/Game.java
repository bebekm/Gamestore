/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsni.gamestore.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
/**
 *
 * @author Korisnik
 */
@Entity
public class Game extends Entitet{
 
    private String name;
    private Date releaseDate;
    private String rating;
    private String publisher;
    private String price;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }
    
    public void setReleaseDate(String string) {
        this.releaseDate = releaseDate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    @Override
    public String toString() {
        if(getName()==null || getName().trim().isEmpty()){
            return"[Name isn't defined]";
        }

        return getName();
    }
    

    
}
