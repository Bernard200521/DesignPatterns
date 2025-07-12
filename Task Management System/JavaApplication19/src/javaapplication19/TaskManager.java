/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author wilso
 */
public class TaskManager {
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head = null;

    // Add task at end
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null)
                current = current.next;
            current.next = newNode;
        }
        System.out.println("Task added.");
    }

    // Search by taskId
    public Task searchTask(String id) {
        Node current = head;
        while (current != null) {
            if (current.task.taskId.equalsIgnoreCase(id))
                return current.task;
            current = current.next;
        }
        return null;
    }

    // Traverse
    public void listTasks() {
        if (head == null) {
            System.out.println("No tasks.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete by taskId
    public void deleteTask(String id) {
        if (head == null) {
            System.out.println("No tasks to delete.");
            return;
        }

        if (head.task.taskId.equalsIgnoreCase(id)) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.task.taskId.equalsIgnoreCase(id)) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Task not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Task deleted.");
        }
    }
}

