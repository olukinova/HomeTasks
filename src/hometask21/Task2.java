

package hometask21;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static List<Exception> CreateExceptionList() {

        List <Exception> exceptions = new ArrayList<>();

        // exception 1

        try {

            int[] arr = new int[2];
            arr[3] = 5;
        } catch(ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        //exception 2

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        //exception 3

        try {
            int num = Integer.parseInt(("AAA"));
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        //exception 4

        try {
            int num = 10;
            int num2 = num / 0;
            System.out.println(num2);
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }

        return exceptions;
    }

    public static void main(String[] args) {
        List<Exception> exceptions = new ArrayList<>(Task2.CreateExceptionList());
        System.out.println(exceptions);
    }
}
