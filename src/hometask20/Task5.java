package hometask20;
import java.util.*;

public class Task5 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(13);
        numbers.add(13);
        numbers.add(34);
        numbers.add(56);


        System.out.println(numbers);

        int result = 0;
        for (Integer num: numbers) {
            result += num;
        }

        System.out.println(result);


    }
}
