package hometask19;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

    public static void main(String[] args) {

        ArrayList <String> cars = new ArrayList<>();
        cars.add("Toyota RAV4");
        cars.add("Toyota Corolla");
        cars.add("Toyota Camry");
        cars.add("Toyota Tacoma");

        System.out.println(cars.get(0));
        System.out.println(cars.get(1));
        System.out.println(cars.get(2));
        System.out.println(cars.get(3));

        System.out.println("*****************");

        for(String car: cars) {
            System.out.println(car);
        }

        System.out.println("*****************");


        cars.forEach(car -> System.out.println(car));

        System.out.println("*****************");

        Iterator<String> iterator = cars.iterator();
        while(iterator.hasNext()) {
            String car = iterator.next();
            System.out.println(car);
        }
    }
}
