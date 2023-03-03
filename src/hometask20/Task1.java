package hometask20;
import java.util.*;

public class Task1 {
//1) Create a map of Best Buy store. Place
//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//Retrieve all keys and values from a Best Buy map using EntrySet.
    public static void main(String[] args) {


        Map <Integer, String> bestBy = new HashMap<>();
        bestBy.put(7664847, "Printer");
        bestBy.put(7879885, "TV");
        bestBy.put(1242366, "iPhone");
        bestBy.put(6521651, "Toaster");
        bestBy.put(1231212, "Refrigerator");


        //retrieve all entries
        Set<Map.Entry<Integer, String>> bestByEntries = bestBy.entrySet();
        System.out.println(bestByEntries);

        //retrieve all keys

        Set<Integer> bestByKeys = bestBy.keySet();
        System.out.println(bestByKeys);

        //retrieve all values

        Collection<String> bestByValues = bestBy.values();
        System.out.println(bestByValues);

    }
}
