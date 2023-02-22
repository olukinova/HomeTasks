package HomeTask9;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int length = str.length();
        if(!str.isEmpty()) {
            if(length%2 != 0 && length > 3) {
                System.out.println(str.charAt(length/2));
            }
        }
    }
}
