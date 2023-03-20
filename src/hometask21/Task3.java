package hometask21;

public class Task3 {

    public static void checkAge (int age) throws RuntimeException {

        if(age < 16) {
            throw new RuntimeException("Your age is below required level");
        } else {
            System.out.println("You are eligible for our program");
        }
    }

    public static void main(String[] args) {

        try {
            Task3.checkAge(15);
        } catch (RuntimeException e) {
            System.out.println(e);
        }

    }
}
