package hometask21;

import java.util.Scanner;

public class Task4 {

    public static void checkUserName (String name) throws RuntimeException {
        if (name.length() < 5) {
            throw new RuntimeException("Your name is too short");
        } else {
            System.out.println("Your name is fine");
        }
    }

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your name:");
            String name = scan.next();
            Task4.checkUserName(name);
        } catch (RuntimeException e) {
            System.out.println(e);
        }

    }
}
