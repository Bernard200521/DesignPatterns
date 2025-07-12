/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author wilso
 */
// CustomerRepositoryImpl.java
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(String id) {
        // Simulate fetching from a database
        return "Customer{id='" + id + "', name='John Doe'}";
    }
}

