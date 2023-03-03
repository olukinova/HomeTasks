package hometask19;
import hometask14.A;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {


        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Tea");
        drinks.add("Coffee");
        drinks.add("Matcha Latte");
        drinks.add("Coca cola");
        drinks.add("Pepsi");
        drinks.add("Milk");
        drinks.add("Beer");

   /*     drinks.replaceAll(drink -> drink.contains("a") || drink.contains("e") ? "water" : drink);
        System.out.println(drinks);*/

        //OR


       /* for(int i = 0; i < drinks.size(); i++) {
            String drink = drinks.get(i);
            if(drink.contains("a") || drink.contains("e")) {
                drinks.set(i, "water");
            }
        }

        System.out.println(drinks);
*/

        //OR THIS VERSION BUT IT DOESN'T WORK

    /*    Iterator<String> drinksIterator = drinks.iterator();;
        while (drinksIterator.hasNext()) {
            String drink = drinksIterator.next();
            if (drink.contains("a") || drink.contains("e")) {
                drinksIterator.set("water");
            }

            System.out.println(drinks);


        }*/
    }
}
