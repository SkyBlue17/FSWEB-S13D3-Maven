package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println(person.isTeen());
    }
}
