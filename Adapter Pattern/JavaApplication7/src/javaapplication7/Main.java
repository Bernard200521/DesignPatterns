/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author wilso
 */
public class Main {
    public static void main(String[] args) {
        // Using PayPal
        PaypalGateway paypal = new PaypalGateway();
        PaymentProcessor paypalProcessor = new PaypalAdapter(paypal);
        paypalProcessor.processPayment(500.00);

        // Using Stripe
        StripeGateway stripe = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        stripeProcessor.processPayment(1000.00);
    }
}

