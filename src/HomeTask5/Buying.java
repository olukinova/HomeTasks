package HomeTask5;

import java.util.Scanner;

public class Buying {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter item name:");
        String item = input.next();
        System.out.println("Please enter item price:");
        int price = input.nextInt();
        int amountPaid = 0;

        while(amountPaid < price) {
            System.out.println("How much money do you want to pay");
            int amountToPay = input.nextInt();
            amountPaid += amountToPay;
            int debt = price - amountPaid;

            if (amountPaid < price) {
                System.out.println("It is left to pay off " + debt + "$ for your " + item);
            } else {
                System.out.println("You have payed all your debt, thank you for shopping!");
                int change = amountPaid - price;
                if (change > 0) {
                    System.out.println("Here is your change " + change + "$");
                }
            }
        }

    }
}
