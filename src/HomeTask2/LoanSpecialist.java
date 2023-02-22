package HomeTask2;

import java.util.Scanner;

public class LoanSpecialist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much money do you need?");
        int money = input.nextInt();
        if(money < 200000) {
            System.out.println("We can give you this amount of money, the interest rate will be 5%");
        } else {
            System.out.println("We cannot help you");
        }
    }
}
