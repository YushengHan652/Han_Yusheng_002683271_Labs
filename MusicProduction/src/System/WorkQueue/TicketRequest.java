/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.WorkQueue;

import System.Studio.Studio;
import System.Movie.Movie;
import System.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author seanmacbook
 */
public class TicketRequest {
    public Movie movie;
    public String price;
    public Studio enterprise;
    //public Date date;
    public UserAccount customer;
    public UserAccount cinema;
    public String ID;
    public String time;
    public String comment;

    public TicketRequest() {
        this.ID = this.getRandomNumberByNum(6);
        this.comment = " ";
    }

    
    @Override
    public String toString() {
        return ID;
    }
    
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Studio getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Studio enterprise) {
        this.enterprise = enterprise;
    }

    public UserAccount getCustomer() {
        return customer;
    }

    public void setCustomer(UserAccount customer) {
        this.customer = customer;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public static String getRandomNumberByNum(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            long randomNum = Math.round(Math.floor(Math.random() * 10.0D));
            sb.append(randomNum);
        }
        return sb.toString();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public UserAccount getCinema() {
        return cinema;
    }

    public void setCinema(UserAccount cinema) {
        this.cinema = cinema;
    }
    
    
    
}
