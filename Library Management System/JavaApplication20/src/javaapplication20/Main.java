/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;

/**
 *
 * @author wilso
 */
// Main.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book(2, "1984", "George Orwell"));
        books.add(new Book(3, "To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book(4, "Moby Dick", "Herman Melville"));
        books.add(new Book(5, "Pride and Prejudice", "Jane Austen"));

        // Linear Search
        Book result1 = LibrarySearch.linearSearchByTitle(books, "Moby Dick");
        System.out.println("Linear Search Result: " + result1);

        // Sort list by title for binary search
        Collections.sort(books, Comparator.comparing(b -> b.getTitle().toLowerCase()));

        // Binary Search
        Book result2 = LibrarySearch.binarySearchByTitle(books, "Moby Dick");
        System.out.println("Binary Search Result: " + result2);
    }
}

