package HomeTask2;

import java.util.Scanner;

public class HasDiploma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean hasDiploma = true;
        if(hasDiploma) {
            System.out.println("Congratulations!");
            double gpaScore = input.nextDouble();
            if(gpaScore > 3.5) {
                System.out.println("You are eligible for scholarship");
            } else {
                System.out.println("You should have studied harder");
            }
        } else {
            System.out.println("I think you should get a degree");
        }
    }
}
