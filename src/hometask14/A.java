package hometask14;

public class A {
    String name;

    static void printF () {
        System.out.println("Print some info");
    }

}
class B extends A {
    String name2;

    public static void main(String[] args) {
        B b = new B();
        b.printF();
    }
}

class C extends B {
    String name3;
}




