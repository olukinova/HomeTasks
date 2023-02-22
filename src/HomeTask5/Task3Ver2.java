package HomeTask5;

import java.util.Scanner;

public class Task3Ver2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalPrice = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter item and its price:");
            String item = input.next();
            double itemPrice = input.nextDouble();
            totalPrice = totalPrice + itemPrice;
            System.out.println("This is the total price amount that you have to pay");
        }
    }
}
