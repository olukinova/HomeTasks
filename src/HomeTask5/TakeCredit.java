package HomeTask5;

import java.util.Scanner;

public class TakeCredit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Create a program that will be asking user to apply for a credit card 10 times.
// As soon you get an “yes” from a user program should stop asking.

        for(int i = 1; i <= 10; i++) {
            System.out.println("Do you want apply for a credit?");
            boolean takeCredit = input.nextBoolean();
            if(takeCredit) {
                System.out.println("Ok, how much money do you want to get?");
                break;
            }
        }

        //OR

        for(int i = 0; i < 10; i++) {
            System.out.println("Do you want a credit card?");
            String userResponse = input.next();
            if(userResponse.equalsIgnoreCase("Yes")) {
                System.out.println("Thank you for being our client");
                break;
            }
        }
    }
}
