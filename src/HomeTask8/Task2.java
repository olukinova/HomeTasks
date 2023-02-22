package HomeTask8;

public class Task2 {
    public static void main(String[] args) {
        String[][] cars = {{"Ford", "RAM"}, {"Mercedes", "Audi"}, {"Kia", "Huidai"}, {"Mazeratti"}};

        //Loop #1
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
        }
        System.out.println("************************************");
        //Loop #2

        for(String[] country: cars) {
          for(String car: country) {
             System.out.println(car);
}
        }





    }
}
