package HomeTask10;

public class Task5 {
    public static void main(String[] args) {

    String str = "sir";
    StringBuilder reversed = new StringBuilder(str).reverse();
    if(str.equalsIgnoreCase(reversed.toString())) {
        System.out.println("This word is palindrome");
    } else {
        System.out.println("This word is not a palindrome");
    }

}
}
