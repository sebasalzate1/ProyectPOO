/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockbuster;

import java.util.Vector;

/**
 *
 * @author USER
 */
public class Movie {

    private String name;
    private final String id;
    private Vector<Genre> genres;
    private int units;
    private static int counter = 0;
    private int year;
    private Director director;
    
    //Movie class constructor 

    public Movie(String name, Vector<Genre> genres, int year, Director director, int units) {
        this.name = name;
        this.genres = genres;
        counter++;
        this.id = "M" + counter;
        this.year = year;
        this.director = director;
        this.units = units;
    }

    // Setters and getters
    
    public int getYear() {
        return year;
    }
    
    

    public Director getDirector() {
        return director;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Vector<Genre> getGenres() {
        return genres;
    }
    
    // It gives us the name of the genres
    public String genresToString(){
        String txt = "";
        for (Genre genre: genres){
            txt += genre.getName() + " -- ";
        }
        return txt;
    }

    public int getUnits() {
        return units;
    }
    
    public void rentMovies(){
        this.units-=1;
    }
    
    public void returnMovies(){
        this.units+=1;
    }

    public void setUnits(int units) {
        this.units = units;
    }
    
    // It gives us the name of the movie 
    public String toString(){
        return this.name;
    }
}
