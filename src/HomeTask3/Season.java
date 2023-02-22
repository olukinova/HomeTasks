package HomeTask3;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your birth month?");
        String month = input.next();

        if(month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("December")) {
            System.out.println("You were born in winter");
        } else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")){
            System.out.println("You were born in spring");
        } else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("Auguts")) {
            System.out.println("You were born in summer");
        } else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
            System.out.println("You were born in Autumn");
        } else {
            System.out.println("Invalid");
        }
    }
}
