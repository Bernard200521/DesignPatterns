/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author wilso
 */
// Main.java
public class Main {
    public static void main(String[] args) {
        // Base notifier
        Notifier baseNotifier = new EmailNotifier();

        // Decorated with SMS and Slack
        Notifier multiChannelNotifier = new SlackNotifierDecorator(
                                            new SMSNotifierDecorator(baseNotifier));

        multiChannelNotifier.send("System maintenance at 2 AM.");
    }
}
