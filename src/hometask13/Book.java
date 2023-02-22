package hometask13;

public class Book {
    String author;
    String name;
    String language;
    int year;

    Book(String authorName, String bookName) {
        author = authorName;
        name = bookName;
    }
    Book(String authorName, String bookName, String bookLanguage, int yearIssued) {
        author = authorName;
        name = bookName;
        language = bookLanguage;
        year = yearIssued;
    }

    public static void main(String[] args) {
        Book b1 = new Book ("katrin Hanna", "My girl", "English", 2022);
        System.out.println(b1.author + " " + b1.name + " " + b1.language + " " + b1.year);
        Book b2 = new Book ("katrin Hanna", "My girl");
        System.out.println(b2.author + " " + b2.name);
    }
}
