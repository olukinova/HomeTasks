package HomeTask2;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = input.nextInt();
        if(age > 18) {
            System.out.println("You are eligible for a driver licence");
        } else {
            System.out.println("I can only offer you to get a learner's permit");
        }
    }
}
