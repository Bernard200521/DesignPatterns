/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author wilso
 */
public class PaypalAdapter implements PaymentProcessor {
    private PaypalGateway paypalGateway;

    public PaypalAdapter(PaypalGateway gateway) {
        this.paypalGateway = gateway;
    }

    @Override
    public void processPayment(double amount) {
        paypalGateway.sendPayment(amount);
    }
}

