package HomeTask8;

public class DogTester {
    public static void main(String[] args) {
        Dog husky = new Dog();
        husky.name = "Charly";
        husky.breed = "Husky";
        husky.age = 3;
        husky.color = "Black and white";

        husky.bark();
        husky.tailwave();
        husky.guard();


        Dog bulldog = new Dog();
        bulldog.name = "Whinston";
        bulldog.color = "Brown";
        bulldog.age = 7;
        bulldog.breed = "Bulldog";

        bulldog.bark();
        bulldog.tailwave();
        bulldog.guard();


        Dog labrador = new Dog();
        labrador.name = "Mima";
        labrador.breed = "Labrador";
        labrador.color = "Golden";
        labrador.age = 1;

        labrador.bark();
        labrador.tailwave();
        labrador.guard();

    }
}
