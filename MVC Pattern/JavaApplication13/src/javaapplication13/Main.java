/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author wilso
 */
// Main.java
public class Main {
    public static void main(String[] args) {
        // Create model
        Student student = new Student("Alice", "S1234", "A");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Initial display
        controller.updateView();

        System.out.println("\n--- Updating student details ---\n");

        // Update model via controller
        controller.setStudentName("Alice Johnson");
        controller.setStudentGrade("A+");

        // Display updated info
        controller.updateView();
    }
}

