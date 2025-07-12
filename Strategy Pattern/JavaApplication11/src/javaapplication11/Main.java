/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author wilso
 */
// Main.java
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Use Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        context.makePayment(250.00);

        System.out.println();

        // Use PayPal
        context.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        context.makePayment(99.99);
    }
}
