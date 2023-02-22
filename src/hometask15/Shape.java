package hometask15;

public class Shape {
    double radius;
}

class Circle extends Shape {
    double calculateArea (double radius) {
        double area = 3.14 * (radius * radius);
        return area;
    }
}
class Test {
    public static void main(String[] args) {

        Circle circle = new Circle();
        double area = circle.calculateArea(4);
        System.out.println(area);
    }
}
