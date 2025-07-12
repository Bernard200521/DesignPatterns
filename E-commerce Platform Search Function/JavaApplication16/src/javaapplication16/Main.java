/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author wilso
 */
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Mouse", "Electronics"),
            new Product("P003", "Chair", "Furniture"),
            new Product("P004", "Table", "Furniture")
        };

        // Linear Search
        int result1 = SearchAlgorithms.linearSearch(products, "Chair");
        System.out.println(result1 != -1 ? "Found (Linear): " + products[result1] : "Not found (Linear)");

        // Sort for Binary Search
        Arrays.sort(products, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));

        // Binary Search
        int result2 = SearchAlgorithms.binarySearch(products, "Chair");
        System.out.println(result2 != -1 ? "Found (Binary): " + products[result2] : "Not found (Binary)");
    }
}

