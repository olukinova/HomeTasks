package HomeTask12;

public class Task3 {
    private static String vowels (String str) {
        return str.replaceAll("[aeiouAEIOU]", "");

    }

    public static void main(String[] args) {
        Task3 elim = new Task3();
        String newStr = elim.vowels("I love Java!");
        System.out.println(newStr);
    }
}
