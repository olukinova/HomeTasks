package HomeTask10;

public class Task3 {
    public static void main(String[] args) {
        String str = "Is it Saturday? Do we have Java Class today?";
        String[] result = str.split("[?]");
        System.out.println(result.length);
    }
}
