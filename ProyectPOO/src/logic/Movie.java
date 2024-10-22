/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author USER
 */
public class Movie {

    private String title;
    private String genre;
    private int year;
    private String director;
    private boolean available;
    
    //Constructor 

    public Movie() {
    }

    public Movie(String title, String genre, int year, String director, boolean available) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.director = director;
        this.available = available;
    }
    
    

    
    // Getter and setters   
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    
}
