/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.WorkQueue;

import System.Platform.Room;
import System.Studio.Studio;
import System.Movie.Movie;
import System.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author seanmacbook
 */
public class CinemaRequest {
    private Movie movie;
    private Studio cinemaEn;
    private UserAccount cinemaAdmin;
    private List<UserAccount> cinemaEmployeeList;
    private String movieName;
    private Room room;
    private double price;
    
    public CinemaRequest(String movieName) {
        this.movieName = movieName;
        cinemaEmployeeList = new ArrayList();
    }
    
    @Override
    public String toString() {
        return movieName;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Studio getCinemaEn() {
        return cinemaEn;
    }

    public void setCinemaEn(Studio cinemaEn) {
        this.cinemaEn = cinemaEn;
    }

    public List<UserAccount> getCinemaEmployeeList() {
        return cinemaEmployeeList;
    }

    public void setCinemaEmployeeList(List<UserAccount> cinemaEmployeeList) {
        this.cinemaEmployeeList = cinemaEmployeeList;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    
    public void addEmployee(UserAccount em) {
        cinemaEmployeeList.add(em);
    }

    public UserAccount getCinemaAdmin() {
        return cinemaAdmin;
    }

    public void setCinemaAdmin(UserAccount cinemaAdmin) {
        this.cinemaAdmin = cinemaAdmin;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}
