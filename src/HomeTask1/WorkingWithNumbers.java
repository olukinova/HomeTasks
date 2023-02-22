package HomeTask1;

public class WorkingWithNumbers {
    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 9.5;

        double addRes = num1 + num2;
        double subtrRes = num1 - num2;
        double multlRes = num1 * num2;
        double divRes = num1 / num2;

        System.out.println("The Addition of 2 numbers " +num1 + " and " + num2 + " is equal to " + addRes);
        System.out.println("The Subtraction of 2 numbers " +num1 + " and " + num2 + " is equal to " + subtrRes);
        System.out.println("The Multiplication of 2 numbers " +num1 + " and " + num2 + " is equal to " + multlRes);
        System.out.println("The Division of 2 numbers " +num1 + " and " + num2 + " is equal to " + divRes);
    }
}
