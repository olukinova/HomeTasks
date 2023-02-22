package HomeTask2;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How long have you been working here?");
        int years = input.nextInt();

        if(years > 5) {
            System.out.println("You are eligible for the bonus!");
            System.out.println("What is your annual salary?");
            int salary = input.nextInt();
            if(salary > 50000) {
                System.out.println("Your bonus is 5000");
            } else {
                System.out.println("Your bonus is 3000");
            }
        } else {
            System.out.println("I'm sorry but you're not eligible for the bonus now");
        }
    }
}
