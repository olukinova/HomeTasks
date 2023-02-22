package HomeTask3;

import java.util.Locale;
import java.util.Scanner;

public class Language {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter country name");
        String country = input.next();

        switch(country.toLowerCase()) {
            case "germany":
                System.out.println("German");
                break;
            case "italy":
                System.out.println("Italian");
                break;
            case "ukraine":
                System.out.println("Ukrainian");
                break;
            default:
                System.out.println("Invalid");
        }


        System.out.println("Please enter your grade");
        String grade = input.next();
        switch (grade.toLowerCase()) {
            case "a":
                System.out.println("Excellent");
                break;
            case "b":
                System.out.println("Good");
                break;
            case "c":
                System.out.println("Average");
                break;
            case "d":
                System.out.println("Bad");
                break;
            default:
                System.out.println("Not Acceptable");
        }
    }
}
