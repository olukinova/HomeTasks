package hometask13;

public class Main {
    String censorLetter(String str, char c) {
        return str.replaceAll(c + "", "*");
    }

    public static void main(String[] args) {
        Main md = new Main();
        String censored = md.censorLetter("Computer science", 'e');
        String censored1 = md.censorLetter("trick or treat", 'e');
        System.out.println(censored);
        System.out.println(censored1);
    }
}
