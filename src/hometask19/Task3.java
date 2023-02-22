package hometask19;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {

    public static void main(String[] args) {


        ArrayList<String> words = new ArrayList<>();
        words.add("clone");
        words.add("Earth");
        words.add("telephone");
        words.add("desk");

       /* words.removeIf(word -> word.endsWith("e"));
        System.out.println(words);*/

        //OR

        Iterator <String> wordsIterator = words.iterator();
        while(wordsIterator.hasNext()) {
            String word = wordsIterator.next();
            if(word.endsWith("e")) {
                wordsIterator.remove();
            }
        }

        System.out.println(words);

    }
}
