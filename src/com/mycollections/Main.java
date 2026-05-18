/**
 *  Java program to use List interface and ArrayList.
 */

package com.mycollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an ArrayList.
        List list = new ArrayList<>();

        // Printing list to console.
        System.out.println(list); // Output: []

        // Adding elements.
        list.add(0, "object0");
        list.add(1, "object1");
        list.add(2, "object2");
        list.add(3, "object3");
        list.add(4, "object4");

        // Printing list to console.
        System.out.println(list); // Output: [object0, object1, object2, object3, object4]

        // Adding more elements to list.
        list.add("object5");

        // Printing list to console.
        System.out.println(list); // Output: [object0, object1, object2, object3, object4, object5]

        // Adding more elements to list.
        list.add(0, "object6");

        // Printing list to console.
        System.out.println(list); // Output: [object6, object0, object1, object2, object3, object4, object5]

        // Setting an object at index 0.
        list.set(0, "object7");

        // Printing list to console.
        System.out.println(list); // Output: [object7, object0, object1, object2, object3, object4, object5]

        // Removing object with index 3.
        list.remove(3);

        // Printing list to console.
        System.out.println(list); // Output: [object7, object0, object1, object3, object4, object5]

        // Removing object with value "object3".
        list.remove("object3");

        // Printing list to console.
        System.out.println(list); // Output: [object7, object0, object1, object4, object5]

        // Iterating through the list.
        System.out.println("Iterator prints:");
        Iterator it = list.iterator();
        while (it.hasNext()) {

            // Printing next object to console.
            System.out.println(it.next()); // Output: object7 /nobject0 /nobject /nobject4 /nobject5
        }

        // Iterating through the list.
        ListIterator lit = list.listIterator();
        System.out.println("ListIterator prints:");
        while (lit.hasNext()) {

            // Printing next object to console.
            System.out.println(lit.next()); // Output:

        }
    }
}