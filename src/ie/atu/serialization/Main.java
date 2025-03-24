package ie.atu.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a book
        // Book book = new Book("Java Fundamentals", "John Doe", 29.99);
        // System.out.println("Original Book: " + book);

        // // Serialize
        // try (FileOutputStream fileOut = new FileOutputStream("resources/book.ser");
        // ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
        // out.writeObject(book);
        // System.out.println("Book has been serialized");
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // // Deserialize
        // try (FileInputStream fileIn = new FileInputStream("resources/book.ser");
        // ObjectInputStream in = new ObjectInputStream(fileIn)) {
        // Book deserializedBook = (Book) in.readObject();
        // System.out.println("Book has been deserialized");
        // System.out.println("Deserialized Book: " + deserializedBook);
        // } catch (IOException | ClassNotFoundException e) {
        // e.printStackTrace();
        // }

        // // Create a movie
        // Movie movie = new Movie("Inception", "Christopher Nolan", 2010, 8.8);
        // System.out.println("Original Movie: " + movie);

        // // Serialize
        // try (FileOutputStream fileOut = new FileOutputStream("resources/movie.ser");
        // ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
        // out.writeObject(movie);
        // System.out.println("Movie has been serialized");
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        // // Deserialize
        // try (FileInputStream fileIn = new FileInputStream("resources/movie.ser");
        // ObjectInputStream in = new ObjectInputStream(fileIn)) {
        // Movie deserializedMovie = (Movie) in.readObject();
        // System.out.println("Movie has been deserialized");
        // System.out.println("Deserialized Movie: " + deserializedMovie);
        // } catch (IOException | ClassNotFoundException f) {
        // f.printStackTrace();
        // }

        // // serialize a list of books
        // // Create a list of books
        // List<Book> books = new ArrayList<>();
        // books.add(new Book("The Hobbit", "J.R.R. Tolkien", 19.99));
        // books.add(new Book("1984", "George Orwell", 15.99));
        // books.add(new Book("Pride and Prejudice", "Jane Austen", 12.99));

        // System.out.println("Original catalog:");
        // books.forEach(System.out::println);

        // // Serialize list
        // serializeBooks(books, "resources/library.ser");

        // // Deserialize list
        // List<Book> loadedBooks = deserializeBooks("resources/library.ser");

        // System.out.println("\nDeserialized catalog:");
        // loadedBooks.forEach(System.out::println);
        // }

        // private static void serializeBooks(List<Book> books, String filename) {
        // try (ObjectOutputStream out = new ObjectOutputStream(
        // new FileOutputStream(filename))) {
        // out.writeObject(books);
        // System.out.println("\nCatalog has been serialized");
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        // }

        // private static List<Book> deserializeBooks(String filename) {
        // List<Book> books = new ArrayList<>();
        // try (ObjectInputStream in = new ObjectInputStream(
        // new FileInputStream(filename))) {
        // books = (List<Book>) in.readObject();
        // System.out.println("Catalog has been deserialized");
        // } catch (IOException | ClassNotFoundException e) {
        // e.printStackTrace();
        // }
        // return books;



    //     // serialize a list of movies
    //     // Create a list of movies
    //     List<Movie> movies = new ArrayList<>();
    //     movies.add(new Movie("The Matrix", "Lana Wachowski, Lilly Wachowski", 1999, 8.7));
    //     movies.add(new Movie("The Shawshank Redemption", "Frank Darabont", 1994, 9.3));
    //     movies.add(new Movie("The Godfather", "Francis Ford Coppola", 1972, 9.2));
    //     System.out.println("Original catalog:");
    //     movies.forEach(System.out::println);
    //     // Serialize list
    //     serializeMovies(movies, "resources/movieLibrary.ser");
    //     // Deserialize list
    //     List<Movie> loadedMovies = deserializeMovies("resources/movieLibrary.ser");
    //     System.out.println("\nDeserialized catalog:");
    //     loadedMovies.forEach(System.out::println);
    // }

    // private static void serializeMovies(List<Movie> movieList, String filename) {
    //     try (ObjectOutputStream out = new ObjectOutputStream(
    //             new FileOutputStream(filename))) {
    //         out.writeObject(movieList);
    //         System.out.println("\nCatalog has been serialized");
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

    // private static List<Movie> deserializeMovies(String filename) {
    //     List<Movie> movies = new ArrayList<>();
    //     try (ObjectInputStream in = new ObjectInputStream(
    //             new FileInputStream(filename))) {
    //         movies = (List<Movie>) in.readObject();
    //         System.out.println("Catalog has been deserialized");
    //     } catch (IOException | ClassNotFoundException e) {
    //         e.printStackTrace();
    //     }
    //     return movies;     
    
    // }

        // Create a bank account
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.00, "1234");
        System.out.println("Original Account: " + account);

        // Serialize
        try (FileOutputStream fileOut = new FileOutputStream("resources/account.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(account);
            System.out.println("Account has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        try (FileInputStream fileIn = new FileInputStream("resources/account.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn)) {
            BankAccount deserializedAccount = (BankAccount) in.readObject();
            System.out.println("Account has been deserialized");
            System.out.println("Deserialized Account: " + deserializedAccount);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    
}


