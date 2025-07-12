
package javaapplication18;

/**
 *
 * @author wilso
 */
public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(10);

        // Add employees
        manager.addEmployee(new Employee("E001", "Alice", "Manager", 90000));
        manager.addEmployee(new Employee("E002", "Bob", "Developer", 75000));
        manager.addEmployee(new Employee("E003", "Charlie", "Tester", 60000));

        // List employees
        System.out.println("All Employees:");
        manager.listEmployees();

        // Search employee
        System.out.println("\nSearching for E002:");
        Employee found = manager.searchEmployee("E002");
        System.out.println(found != null ? found : "Not found.");

        // Delete employee
        System.out.println("\nDeleting E001:");
        manager.deleteEmployee("E001");

        // List again
        System.out.println("\nUpdated Employee List:");
        manager.listEmployees();
    }
}

