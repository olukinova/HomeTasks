package HomeTask11;

public class Task4 {
    String sayHello (String countryName) {
        switch(countryName) {
            case "USA":
                return "Hello!";
            case "Spain":
                return "Hola!";
            case "Italy":
                return "Ciao!";
            case "Ukraine":
                return "Вітаю!";
            default:
                System.out.println("I don't know this language");
        }
        return countryName;
    }
}
