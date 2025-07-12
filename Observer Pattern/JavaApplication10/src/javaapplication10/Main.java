/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author wilso
 */
// Main.java
public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileObserver = new MobileApp("Alice");
        Observer webObserver = new WebApp("Bob");

        stockMarket.registerObserver(mobileObserver);
        stockMarket.registerObserver(webObserver);

        // Simulate stock updates
        stockMarket.setStockData("AAPL", 185.20);
        System.out.println();
        stockMarket.setStockData("GOOGL", 2710.55);
        System.out.println();

        // Deregister one observer
        stockMarket.removeObserver(mobileObserver);
        stockMarket.setStockData("TSLA", 729.50);
    }
}

