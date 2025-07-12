/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author wilso
 */
public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Add tasks
        manager.addTask(new Task("T001", "Write Report", "Pending"));
        manager.addTask(new Task("T002", "Review Code", "In Progress"));
        manager.addTask(new Task("T003", "Deploy App", "Completed"));

        // List tasks
        System.out.println("\nAll Tasks:");
        manager.listTasks();

        // Search task
        System.out.println("\nSearching for T002:");
        Task found = manager.searchTask("T002");
        System.out.println(found != null ? found : "Task not found.");

        // Delete task
        System.out.println("\nDeleting T001:");
        manager.deleteTask("T001");

        // Final list
        System.out.println("\nUpdated Task List:");
        manager.listTasks();
    }
}

