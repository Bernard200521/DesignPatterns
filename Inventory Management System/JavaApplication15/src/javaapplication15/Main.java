/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author wilso
 */
public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Adding products
        manager.addProduct(new Product("P001", "Laptop", 10, 75000));
        manager.addProduct(new Product("P002", "Mouse", 50, 500));

        // Display
        manager.displayAll();

        // Update product
        manager.updateProduct("P002", "Wireless Mouse", 40, 650);

        // Delete product
        manager.deleteProduct("P001");

        // Display after changes
        manager.displayAll();
    }
}

