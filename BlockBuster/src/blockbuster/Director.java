/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockbuster;

/**
 *
 * @author SEBAS
 */
public class Director extends Person {

    private static int counter = 0;
    
    // Director class constructor

    public Director(String name) {
        super(name, "");
        counter++;
        this.setId("" + counter);
    }
    
    // It gives us the name of the director
    
    public String toString(){
        return this.getName();
    }
}
