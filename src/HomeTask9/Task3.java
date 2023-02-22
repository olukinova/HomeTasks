package HomeTask9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter mom's name:");
        String momsName = scan.next();
        System.out.println("Please enter dad's name:");
        String dadsName = scan.next();
        System.out.println("Boy or girl?");
        String gender = scan.next();

        if(gender.equalsIgnoreCase("boy")) {
            String firstHalf = dadsName.substring(0, dadsName.length()/2);
            String secondHalf = momsName.substring(momsName.length()/2);
            String childName = firstHalf+secondHalf;
            System.out.println(childName);
        } else if (gender.equalsIgnoreCase("girl")){
            String firstHalf = momsName.substring(0, momsName.length()/2);
            String secondHalf = dadsName.substring(dadsName.length()/2);
            String childName = firstHalf+secondHalf;
            System.out.println(childName);
        } else {
            System.out.println("undefined");
        }

    }
}
