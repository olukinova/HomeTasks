package HomeTask10;

public class Task2 {
    public static void main(String[] args) {
        String str = "2934fehgfg2!@@@_(_!##";
        System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());
    }
}
