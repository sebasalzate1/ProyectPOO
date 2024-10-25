package blockbuster;

import java.util.Vector;

/**
 *
 * @author SEBAS
 */
public class Customer extends Person {

    private String email;
    private Vector<Movie> movies;
    private String cellPhoneNumber;
    
    // Customer class constructor 

    public Customer(String name, String id, String email, String cellPhoneNumber) {
        super(name, id);
        this.email = email;
        this.cellPhoneNumber = cellPhoneNumber;
        this.movies = new Vector<Movie>();
    }
    
    //Getters and setters 
    
    public int getRentedMovies(){
        return movies.size();
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Vector<Movie> getMovies() {
        return movies;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMovies(Vector<Movie> movies) {
        for (Movie movie : movies){
            this.movies.add(movie);
        }
    }
    
    //it gives us the name of the customer
    
    public String toString(){
        return super.getName();
    }

}
