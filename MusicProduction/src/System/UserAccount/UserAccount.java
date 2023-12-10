/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.UserAccount;

import System.Employee.EmployeeDirectory;
import System.Movie.MovieDirectory;
import System.WorkQueue.FilmQueue;
import System.Role.Role;
import System.WorkQueue.CinemaQueue;
import System.WorkQueue.TicketQueue;

/**
 *
 * @author seanmacbook
 */
public class UserAccount {
    private String username;
    private String password;
    private EmployeeDirectory employeeList;
    private Role role;
    private FilmQueue filmQueue;
    private CinemaQueue cinemaQueue;
    public MovieDirectory movieList;
    private String email;
    private String gender;
    private TicketQueue ticketQueue;

    public UserAccount() {
        filmQueue = new FilmQueue();
        cinemaQueue = new CinemaQueue();
        ticketQueue = new TicketQueue();
    }
    
     public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public FilmQueue getFilmQueue() {
        return filmQueue;
    }

    public void setFilmQueue(FilmQueue filmQueue) {
        this.filmQueue = filmQueue;
    }

    public EmployeeDirectory getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(EmployeeDirectory employeeList) {
        this.employeeList = employeeList;
    }

    public MovieDirectory getMovieList() {
        return movieList;
    }

    public void setMovieList(MovieDirectory movieList) {
        this.movieList = movieList;
    }
    
    @Override
    public String toString() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CinemaQueue getCinemaQueue() {
        return cinemaQueue;
    }

    public void setCinemaQueue(CinemaQueue cinemaQueue) {
        this.cinemaQueue = cinemaQueue;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public TicketQueue getTicketQueue() {
        return ticketQueue;
    }

    public void setTicketQueue(TicketQueue ticketQueue) {
        this.ticketQueue = ticketQueue;
    }
}
