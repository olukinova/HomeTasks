package HomeTask5;

import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {
        // Write a program that reads a range of integers (start and end point),
        // provided by a user and then from that range prints the sum of the even and odd integers.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter start number:");
        int start = input.nextInt();
        System.out.println("Enter end number:");
        int end = input.nextInt();


        int evenSum = 0;
        int oddSum = 0;
        for (int i = start; i <= end; i++) {
            if(i%2 == 0) {
                evenSum += i;
            } else if (i%2 != 0) {
                oddSum += i;
            }
        }
        System.out.println("Sum of even numbers withing a range is " + evenSum);
        System.out.println("Sum of odd numbers withing a range is " + oddSum);

        // Add all numbers from 0 to 10
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

    }

}
// 2 4 6 8 10
// 3 5 7 9
