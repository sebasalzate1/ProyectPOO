/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockbuster;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author USER
 */
public class Function {
    
    //Validates numbers

    public static boolean validateInt(String text, int minValue, int maxValue) {
        try {
            int number = Integer.parseInt(text);
            return number <= maxValue && number >= minValue;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    //Validates strings 

    public static boolean validateString(String str, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
    
    // method to fill out the lists

    public static void fillAll(Vector<Customer> customers,
            Vector<Movie> movies,
            Vector<Genre> genres,
            Vector<Director> directors,
            Vector<Rental> rentals) {
        
        // Pre-made lists

        genres.add(new Genre("Action"));
        genres.add(new Genre("Adventure"));
        genres.add(new Genre("Comedy"));
        genres.add(new Genre("Drama"));
        genres.add(new Genre("Horror"));
        genres.add(new Genre("Science Fiction"));
        genres.add(new Genre("Fantasy"));
        genres.add(new Genre("Romance"));
        genres.add(new Genre("Thriller"));
        genres.add(new Genre("Mystery"));
        genres.add(new Genre("Animation"));
        genres.add(new Genre("Documentary"));
        genres.add(new Genre("Musical"));
        genres.add(new Genre("Biography"));
        genres.add(new Genre("History"));
        genres.add(new Genre("Western"));
        genres.add(new Genre("War"));
        genres.add(new Genre("Sports"));

        directors.add(new Director("Steven Spielberg"));
        directors.add(new Director("Martin Scorsese"));
        directors.add(new Director("Quentin Tarantino"));
        directors.add(new Director("Christopher Nolan"));
        directors.add(new Director("Alfred Hitchcock"));
        directors.add(new Director("Stanley Kubrick"));
        directors.add(new Director("James Cameron"));
        directors.add(new Director("Francis Ford Coppola"));
        directors.add(new Director("Ridley Scott"));
        directors.add(new Director("Peter Jackson"));
        directors.add(new Director("Akira Kurosawa"));
        directors.add(new Director("Guillermo del Toro"));
        directors.add(new Director("Wes Anderson"));
        directors.add(new Director("Hayao Miyazaki"));
        directors.add(new Director("David Fincher"));

        movies.add(new Movie("Inception", genres, 2010, new Director("Christopher Nolan"), 200));
        movies.add(new Movie("The Godfather", genres, 1972, new Director("Francis Ford Coppola"), 152));
        movies.add(new Movie("Pulp Fiction", genres, 1994, new Director("Quentin Tarantino"), 50));
        movies.add(new Movie("The Dark Knight", genres, 2008, new Director("Christopher Nolan"), 5));
        movies.add(new Movie("Schindler's List", genres, 1993, new Director("Steven Spielberg"), 35));
        movies.add(new Movie("Forrest Gump", genres, 1994, new Director("Robert Zemeckis"), 100));
        movies.add(new Movie("Fight Club", genres, 1999, new Director("David Fincher"), 67));
        movies.add(new Movie("The Matrix", genres, 1999, new Director("Lana Wachowski, Lilly Wachowski"), 85));
        movies.add(new Movie("Gladiator", genres, 2000, new Director("Ridley Scott"), 15));
        movies.add(new Movie("Titanic", genres, 1997, new Director("James Cameron"), 33));

        customers.add(new Customer("Customer 1", "123456", "customer1@example.com", "1234567890"));
        customers.add(new Customer("Customer 2", "123457", "customer2@example.com", "1234567891"));
        customers.add(new Customer("Customer 3", "123458", "customer3@example.com", "1234567892"));
        customers.add(new Customer("Customer 4", "123459", "customer4@example.com", "1234567893"));
        customers.add(new Customer("Customer 5", "123460", "customer5@example.com", "1234567894"));
        customers.add(new Customer("Customer 6", "123461", "customer6@example.com", "1234567895"));
        customers.add(new Customer("Customer 7", "123462", "customer7@example.com", "1234567896"));
        customers.add(new Customer("Customer 8", "123463", "customer8@example.com", "1234567897"));
        customers.add(new Customer("Customer 9", "123464", "customer9@example.com", "1234567898"));
        customers.add(new Customer("Customer 10", "123465", "customer10@example.com", "1234567899"));
        customers.add(new Customer("Customer 11", "123466", "customer11@example.com", "2234567890"));
        customers.add(new Customer("Customer 12", "123467", "customer12@example.com", "2234567891"));
        customers.add(new Customer("Customer 13", "123468", "customer13@example.com", "2234567892"));
        customers.add(new Customer("Customer 14", "123469", "customer14@example.com", "2234567893"));
        customers.add(new Customer("Customer 15", "123470", "customer15@example.com", "2234567894"));
        customers.add(new Customer("Customer 16", "123471", "customer16@example.com", "2234567895"));
        customers.add(new Customer("Customer 17", "123472", "customer17@example.com", "2234567896"));
        customers.add(new Customer("Customer 18", "123473", "customer18@example.com", "2234567897"));
        customers.add(new Customer("Customer 19", "123474", "customer19@example.com", "2234567898"));
        customers.add(new Customer("Customer 20", "123475", "customer20@example.com", "2234567899"));
        
        //Pre-made list for rentals 
        
        Vector<Movie> moviesToRentals = new Vector<>();
        for (int i = 0; i<3; i++){
            moviesToRentals.add(movies.elementAt(i));
        }
        for (int i = 0; i<15; i++){
            rentals.add(new Rental(customers.elementAt(i), moviesToRentals));
        }
        
        rentals.get(0).setEndDateTest();
        rentals.get(1).closeRental();
    }

}
