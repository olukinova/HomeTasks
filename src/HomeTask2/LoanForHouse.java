package HomeTask2;

import java.util.Scanner;

public class LoanForHouse {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("What is the interest rate for me?");
      double interestRate = input.nextDouble();

      if(interestRate < 4.5) {
          System.out.println("I can afford a house and I can buy it");
          System.out.println("What is the price of a house?");
          int housePrice = input.nextInt();
          if(housePrice > 200000) {
              System.out.println("I will take a loan");
          } else {
              System.out.println("I will pay cash");
          }
      } else {
          System.out.println("I will not buy a house");
      }
      }
    }

