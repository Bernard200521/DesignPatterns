/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author wilso
 */
// Main.java
public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // First time: loads from remote
        image1.display();
        System.out.println();

        // Second time: uses cached version
        image1.display();
        System.out.println();

        // First time for a different image
        image2.display();
    }
}

