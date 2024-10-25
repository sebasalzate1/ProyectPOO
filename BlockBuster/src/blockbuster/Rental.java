/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockbuster;

import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author SEBAS
 */
public class Rental {

    private static int counter = 0;
    private Customer customer;
    private final int id;
    private Vector<Movie> movies;
    private Date startDate;
    private Date endDate;
    private String state;
    
    // Rental class constructor

    public Rental(Customer customer, Vector<Movie> movies) {
        this.customer = customer;
        this.movies = movies;
        this.startDate = new Date();
        this.endDate = getEndDate(this.startDate);
        counter++;
        this.id = counter;
        this.state = "ON TIME";
    }
    
    // Setters and getters

    public Customer getCustomer() {
        return customer;
    }

    public int getId() {
        return id;
    }

    public Vector<Movie> getMovies() {
        return movies;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setStartDate() {
        this.startDate = new Date();
        this.endDate = getEndDate(this.startDate);
    }
    
    // It gives us the name of the movies

    public String moviesToString() {
        String txt = "";
        for (Movie movie : movies) {
            txt += movie.getName() + " -- ";
        }
        return txt;
    }

    // It calculates the end date
    
    private Date getEndDate(Date startDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        calendar.add(Calendar.DAY_OF_YEAR, 7);
        Date date = calendar.getTime();
        return date;
    }

    // It calculates the end date
    
    public void setEndDateTest() {
        Date currentDate = new Date();
        this.endDate = new Date(currentDate.getTime() - 10 * 24 * 60 * 60 * 1000L);
    }

    public String getState() {
        return state;
    }
    
    // It allows us to close a rental   
    
    public void closeRental() {
        this.state = "RETURNED";
    }

    //Responsible for verifying the status of a rental    
    
    public void verifyStatus() {
        Date currentDate = new Date();
        if (currentDate.compareTo(this.endDate) > 0) {
            this.state = "OVERDUE";
        }
    }

}
