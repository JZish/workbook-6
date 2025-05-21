package com.pluralsight.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkingWithInterfaces {public static void main(String[] args) {
    List<Person> myFamily = new ArrayList<>();

    myFamily.add(new Person("Dana", "Wyatt", 63));
    myFamily.add(new Person("Zachary", "Westly", 31));
    myFamily.add(new Person("Elisha", "Aslan", 14));
    myFamily.add(new Person("Ian", "Auston", 16));
    myFamily.add(new Person("Zephaniah", "Hughes", 9));
    myFamily.add(new Person("Ezra", "Aiden", 17));
    myFamily.add(new Person("Ian", "Auston", 12)); // Duplicate name to test age tie-breaker

    System.out.println("Before Sorting:");
    for (Person individual : myFamily) {
        System.out.println(individual);
    }

    // Sort using the Comparable implementation
    Collections.sort(myFamily);

    System.out.println("\nAfter Sorting:");
    for (Person individual : myFamily) {
        System.out.println(individual);
    }
}
}