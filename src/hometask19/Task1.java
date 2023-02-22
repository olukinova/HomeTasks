package hometask19;

import hometask14.A;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add("Olena");
        names.add("Petro");
        names.add("Vasyl");
        names.add("Sofiia");
        names.add("Illya");


        System.out.println(names.isEmpty());
        System.out.println(names.contains("Olena"));
        System.out.println(names.contains("Makar"));
        System.out.println(names.size());

       names.forEach(name -> System.out.println(name));
     }

}
