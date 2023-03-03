package hometask20.Task2;

public class Person {

    //Create a Person class with following private fields: name, lastName, age, salary.
    //Variables should be initialized through constructor.
    //Inside the class also create a method to print user details.
    //In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object.
    // Print each object details.

    String name, lastName;
    Double salary;
    int age;

    public Person(String name, String lastName, Double salary, int age) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }

    public void display() {

        System.out.println("Employee " + name + " " + lastName + " is " + age + " years old and he makes " + salary + "$ per year");

    }
}
