package HomeTask5;

public class Task6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
           if (i <= 5) {
               if(i%2 == 0) {
                   System.out.println();
               } else {
                   System.out.println("*");
               }
           } else {
               if(i%2 == 0) {
                   System.out.println("**");
               } else {
                   System.out.println("*");
               }
           }
        }
    }
}
