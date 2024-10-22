/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Rent {
    private Client client;
    private Movie movie;
    private Date rentDate;
    private Date returnDate;
    
    
    //Constructor

    public Rent() {
    }

    public Rent(Client client, Movie movie, Date rentDate, Date returnDate) {
        this.client = client;
        this.movie = movie;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
    }
    
    //Getters and setters 

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
    
    
    
    
    
}


    