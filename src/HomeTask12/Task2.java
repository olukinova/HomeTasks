package HomeTask12;

public class Task2 {

    public static String reverseString (String str) {
        StringBuilder strBuild = new StringBuilder(str).reverse();
        String reversed = strBuild.toString();
        return reversed;
    }

    public static void main(String[] args) { // to make this method accessible only from class without creating an
        // object use 'static' keyword
        Task2 revString = new Task2();
        String str = "Hi, my name is Olena";
        String reversed = revString.reverseString(str);
        System.out.println(reversed);

    }

}
