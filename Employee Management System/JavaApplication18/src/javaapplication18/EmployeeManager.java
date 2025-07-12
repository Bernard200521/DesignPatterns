/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author wilso
 */
public class EmployeeManager {
    private Employee[] employees;
    private int count;

    public EmployeeManager(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Add employee
    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
            System.out.println("Employee added.");
        } else {
            System.out.println("Employee array is full.");
        }
    }

    // Search by ID
    public Employee searchEmployee(String id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equalsIgnoreCase(id)) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse
    public void listEmployees() {
        if (count == 0) {
            System.out.println("No employees.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(employees[i]);
            }
        }
    }

    // Delete by ID
    public void deleteEmployee(String id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equalsIgnoreCase(id)) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1]; // Shift left
                }
                employees[--count] = null;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}

