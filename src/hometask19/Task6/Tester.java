package hometask19.Task6;

import java.util.ArrayList;
import java.util.Iterator;

public class Tester {
    public static void main(String[] args) {


        ArrayList<Insurance> list = new ArrayList<>();
        list.add(new Car("Toyota", "Anthem"));
        list.add(new Pet("Colibri", "Anthem"));
        list.add(new Health("Anthem"));

        //Using enhanced for loop

        for (Insurance i : list) {
           i.getQuote();
           i.cancelInsurance();
        }

        System.out.println("****************");

         // using iterator

        Iterator<Insurance> iterator = list.iterator();
        while(iterator.hasNext()) {
            Insurance ins = iterator.next();
            ins.getQuote();
            ins.cancelInsurance();
        }
    }
}
