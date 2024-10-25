/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blockbuster;

import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

/**
 *
 * @author SEBAS
 */
public class BlockBuster {

    /**
     * @param args the command line arguments
     */
    private Vector<Customer> customers;
    private Vector<Movie> movies;
    private Vector<Rental> rentals;
    private Vector<Director> directors;
    private Vector<Genre> genres;
    
    //BlockBuster class constructor

    public BlockBuster() {
        customers = new Vector<>();
        movies = new Vector<>();
        rentals = new Vector<>();
        directors = new Vector<>();
        genres = new Vector<>();
    }
    
    //It is responsible for adding movies to its respective list
    public void saveMovie(String title, String[] genres, String year, Object director, String units) {
        Vector<Genre> vectorGenre = new Vector<>();
        for (String genre : genres) {
            vectorGenre.add(new Genre(genre));
        }
        int intYear = Integer.parseInt(year);
        int intUnits = Integer.parseInt(units);
        Director directorMovie = new Director(director.toString());
        Movie movie = new Movie(title, vectorGenre, intYear, directorMovie, intUnits);
        movies.add(movie);
    }

    //It is responsible for filling all the vectors  
    public void fill() {
        Function.fillAll(customers, movies, genres, directors, rentals);
    }

    //Responsible for adding a new director to the list
    public void addDirector(String directorName) {
        this.directors.add(new Director(directorName));
    }

    //It is responsible for checking if a client exists
    public boolean existingClient(String id) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
    
    //Responsible for adding a new rent to the list
    public void saveRental(Customer customer, List<String> moviesNames){
        Vector<Movie> moviesToRental = movies.stream()
                .filter(movie -> moviesNames.contains(movie.getName()))
                .collect(Collectors.toCollection(Vector::new));
        rentals.add(new Rental(customer, moviesToRental)); 
        setRentedUnits(customer, moviesToRental);
    }
    
    //Responsible for renting designated units
    public void setRentedUnits(Customer customer, Vector<Movie> movies){
        customer.setMovies(movies);
        for (Movie movie : movies){
            movie.rentMovies();
        }
    }
    
    //Responsible for adding a new customer to the list
    public void saveCustomer(String name, String id, String email, String cellPhoneNumber) {
        customers.add(new Customer(name, id, email, cellPhoneNumber));
    }

    // Getters and setters
    public Vector<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Vector<Customer> customers) {
        this.customers = customers;
    }

    public Vector<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Vector<Movie> movies) {
        this.movies = movies;
    }

    public Vector<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(Vector<Rental> rentals) {
        this.rentals = rentals;
    }

    public Vector<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(Vector<Director> directors) {
        this.directors = directors;
    }

    public Vector<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Vector<Genre> genres) {
        this.genres = genres;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
