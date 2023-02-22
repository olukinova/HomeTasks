package hometask19;

import java.sql.Array;
import java.util.ArrayList;

public class Task5 {

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 2; i <= 500; i =+ 2) {
            list.add(i);
        }

        //System.out.println(list);
        list.removeIf(number -> number%5 == 0);
        System.out.println(list);
    }
}
