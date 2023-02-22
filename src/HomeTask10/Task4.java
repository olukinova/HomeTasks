package HomeTask10;

public class Task4 {
    public static void main(String[] args) {
      /* StringBuilder str =  new StringBuilder("abracadabra brabradabra");
       System.out.println(str.reverse());
       // to get an individual letter from StringBuilder
        String st = str.toString();
        System.out.println(st.split(" "));
        String [] s = st.split(" ");
        for (String word: s){
            System.out.println(word);
        }
/*
        String s2 = "This";
        for (int i = s2.length() - 1; i >= 0; i--) {
            System.out.print(s2.charAt(i));
        }*/

        //OR
        String s2 = "I love Java";
        String [] words = s2.split(" ");
        /*System.out.println(words[0]);*/

        for (String word: words) {
            StringBuilder wordBuild = new StringBuilder(word);
            String reversed = wordBuild.reverse().toString();
            System.out.print(reversed + " ");
        }
    }
}
