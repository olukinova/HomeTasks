package HomeTask3;

import java.util.Scanner;

public class WeekendOrWeekday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the day number?");
        int day = input.nextInt();

        if(day >= 1 && day <= 5) {
            System.out.println("It is a weekday");
        } else if (day > 5 && day <= 7) {
            System.out.println("It is a weekend");
        } else {
            System.out.println("Invalid day");
        }

    }
}
