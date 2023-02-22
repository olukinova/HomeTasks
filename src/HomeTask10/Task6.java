package HomeTask10;

public class Task6 {
    public static void main(String[] args) {
        // swap 2 strings without a temporary variable
        String a = "word1";
        String b = "word2";

        a = a.concat(b); // a = "HelloWorld"

        b = a.substring(0, a.length() - b.length()); // b = "Hello"
        System.out.println(a);
        System.out.println("**********************");
        a = a.substring(b.length()); // a = "World"
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
