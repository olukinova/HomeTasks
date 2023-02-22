package HomeTask3;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int num1 = input.nextInt();
        System.out.println("Please enter number 2");
        int num2 = input.nextInt();
        System.out.println("Please enter number 3");
        int num3 = input.nextInt();

        if(num1 > num2) {
            if(num1 > num3) {
                System.out.println("The largest number is " + num1);
            }
        }
        if(num2 > num1) {
            if(num2 > num3) {
                System.out.println("The largest number is " + num2);
            }
        }
        if(num3 > num1) {
            if(num3 > num2) {
                System.out.println("The largest number is " + num3);
            }
        }

    }
}
