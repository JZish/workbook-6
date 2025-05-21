package com.pluralsight.Exercise;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // Implementing the compareTo method
    @Override
    public int compareTo(Person other) {
        // Compare by last name
        int lastNameCompare = this.lastName.compareTo(other.lastName);
        if (lastNameCompare != 0) {
            return lastNameCompare;
        }

        // If last names are equal, compare by first name
        int firstNameCompare = this.firstName.compareTo(other.firstName);
        if (firstNameCompare != 0) {
            return firstNameCompare;
        }

        // If both names are equal, compare by age
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", Age: " + age;
    }
}
