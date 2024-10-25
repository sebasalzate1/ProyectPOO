/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockbuster;

/**
 *
 * @author SEBAS
 */
public class Genre {
    private static int counter = 0;
    private final int id;
    private String name;
    
    //Genre class constructor

    public Genre(String name) {
        counter++;
        this.id = counter;
        this.name = name;
    }
    
    //Setters and getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    // It gives us the name of the genre
    
    public String toString(){
        return this.name;
    }
}
