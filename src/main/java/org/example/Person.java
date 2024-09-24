package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    double weight;
    double height;

    public Person(String firstName, String lastName, int age) {
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Person(double height, double weight, int age, String gender, String lastName, String firstName) {
        this(firstName, lastName,age );
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
        return this.age < 19 && this.age > 13;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
