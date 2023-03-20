


package hometask21;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    // InputMismatchException
    // Whenever you take inputs from the user using a Scanner class, if the input doesn't match the method
    // InputMismatchException is thrown. For example if you're reading an integer data using nextInt() method
    // and the value passed is a String, then InputMismatchException occurs
// Code Example

    int age;
    String name;

    public Task1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }

    public static void main(String[] args) {

       try {
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter your name: ");
           String name = scan.next();
           System.out.println("Enter your age: ");
           int age = scan.nextInt();

           Task1 person = new Task1(name, age); // if we enter "twenty" instead od 20 for age, an InputMismatchException
           // will be thrown
           //The only way to handle this exception is to make sure that you enter proper values while passing inputs.
           //It is suggested to specify required values with complete details while reading data from user using scanner class.
           person.display();
       } catch (InputMismatchException e) {
           System.out.println("Please enter valid credentials: String for the name and integer number for the age");
       }

    }
}
