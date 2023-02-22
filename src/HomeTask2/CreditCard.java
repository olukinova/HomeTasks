package HomeTask2;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        boolean hasCreditCard = input.nextBoolean();
        if(hasCreditCard) {
            System.out.println("What is the balance on your card?");
            int balance = input.nextInt();
            if(balance > 1000) {
                System.out.println("You should pay it off immediately!");
            } else {
                System.out.println("You can spend more money");
            }
        } else {
            System.out.println("I can offer you to open a credit account in our bank");
        }
    }
}
