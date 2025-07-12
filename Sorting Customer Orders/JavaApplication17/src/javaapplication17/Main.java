/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author wilso
 */
public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 450.00),
            new Order("O002", "Bob", 1500.00),
            new Order("O003", "Charlie", 750.00),
            new Order("O004", "David", 300.00)
        };

        // Bubble Sort
        System.out.println("Bubble Sort:");
        OrderSorter.bubbleSort(orders);
        for (Order o : orders) {
            System.out.println(o);
        }

        // Reset data for Quick Sort
        Order[] quickOrders = {
            new Order("O001", "Alice", 450.00),
            new Order("O002", "Bob", 1500.00),
            new Order("O003", "Charlie", 750.00),
            new Order("O004", "David", 300.00)
        };

        // Quick Sort
        System.out.println("\nQuick Sort:");
        OrderSorter.quickSort(quickOrders, 0, quickOrders.length - 1);
        for (Order o : quickOrders) {
            System.out.println(o);
        }
    }
}

