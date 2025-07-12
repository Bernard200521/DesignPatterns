/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;

/**
 *
 * @author wilso
 */
// LibrarySearch.java
import java.util.List;

public class LibrarySearch {

    // Linear search by title
    public static Book linearSearchByTitle(List<Book> books, String targetTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }
        return null;
    }

    // Binary search by title (assumes books list is sorted by title)
    public static Book binarySearchByTitle(List<Book> books, String targetTitle) {
        int low = 0;
        int high = books.size() - 1;
        String target = targetTitle.toLowerCase();

        while (low <= high) {
            int mid = (low + high) / 2;
            String midTitle = books.get(mid).getTitle().toLowerCase();

            int cmp = midTitle.compareTo(target);
            if (cmp == 0) {
                return books.get(mid);
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}

