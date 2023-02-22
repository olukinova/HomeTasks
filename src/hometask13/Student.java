package hometask13;

public class Student {
    String name;
    String address;
    Student (String studentName, String studentAddress) {
        name = studentName;
        address = studentAddress;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Olena", "Cedar Park, Texas");
        System.out.println(student1.name + " " + student1.address);
    }
}
