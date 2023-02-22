package HomeTask3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int num1 = input.nextInt();
        System.out.println("Please enter number 2");
        int num2 = input.nextInt();
        System.out.println("Please enter operator");
        String operator = input.next();

       switch(operator) {
           case "+":
               System.out.println(num1+num2);
               break;
           case "-":
               System.out.println(num1-num2);
               break;
           case "*":
               System.out.println(num1*num2);
               break;
           case "/":
               System.out.println(num1/num2);
               break;
           default:
               System.out.println("Invalid");
}
    }
}
