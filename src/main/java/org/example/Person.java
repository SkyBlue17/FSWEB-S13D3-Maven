package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    double weight;
    double height;

    public Person(int age, String lastName, String firstName) {
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Person(double height, double weight, int age, String gender, String lastName, String firstName) {
        this(age, lastName, firstName);
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return age>13 && age<19;
    }


}
