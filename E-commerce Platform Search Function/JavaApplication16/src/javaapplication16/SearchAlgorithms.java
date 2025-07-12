/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author wilso
 */
public class SearchAlgorithms {

    public static int linearSearch(Product[] products, String key) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, String key) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = key.compareToIgnoreCase(products[mid].getProductName());

            if (comparison == 0) return mid;
            else if (comparison < 0) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
