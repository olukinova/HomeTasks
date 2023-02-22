package HomeTask8;

public class PhoneTester {
    public static void main(String[] args) {

        Phone samsung = new Phone();
        samsung.make = "Samsung";
        samsung.color = "Black";
        samsung.year = 2023;
        samsung.memory = 256;

        samsung.ring();
        samsung.silent();

        Phone pixel = new Phone();
        pixel.make = "Pixel";
        pixel.color = "Red";
        pixel.year = 2022;
        pixel.memory = 128;

        pixel.ring();
        pixel.silent();

        Phone iphone = new Phone();

        iphone.make = "Apple";
        iphone.color = "Gold";
        iphone.year = 2021;
        iphone.memory = 64;

        iphone.ring();
        iphone.silent();







    }
}
