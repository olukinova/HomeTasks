package HomeTask2;

import java.util.Scanner;

public class CityTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the temperature outside?");
        int temperatureInFahrenheit = input.nextInt();
        int temperatureInCelsius = ((temperatureInFahrenheit - 32) * 5) / 9;
        System.out.println("The temperature in the city is " + temperatureInCelsius + " degrees");
    }
}
