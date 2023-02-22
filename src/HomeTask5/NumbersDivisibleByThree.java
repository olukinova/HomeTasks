package HomeTask5;

public class NumbersDivisibleByThree {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
        System.out.println("*****************************");
        //OR
        for (int i = 1; i <= 50; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
    }
}
