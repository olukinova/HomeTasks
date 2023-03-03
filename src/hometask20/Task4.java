package hometask20;

import java.util.*;

public class Task4 {

    //Create the collection that will store single uniques Objects of a
    // String type in which order is preserved.
    //Write a logic to concatenate all string from the collection.
    public static void main(String[] args) {


    Set<String> strings = new LinkedHashSet<>();
    strings.add("I");
    strings.add("love");
    strings.add("study");
    strings.add("Java");

    StringBuffer result = new StringBuffer();

    for(String str: strings) {
        StringBuffer strBuf = new StringBuffer(str);
        result.append(strBuf + " ");
    }

        System.out.println(result);
}}
