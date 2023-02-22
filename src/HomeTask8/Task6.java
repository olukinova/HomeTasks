package HomeTask8;

public class Task6 {
    public static void main(String[] args) {
        String [][] countries = {{"USA", "Canada"}, {"Brasil", "Argentina", "Peru"}, {"China", "Japan", "South Korea"}, {"Morocco", "Egypt", "Ephiopia"}};

        int acc1 = 0;
        int acc2 = 0;

        // Loop 1
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                acc1 += 1;
                System.out.println(countries[i][j]);
            }
        }
        System.out.println("The total amount of countries in the list is " + acc1);

        // Loop #2
        for(String[] region: countries) {
            for(String country: region) {
                System.out.println(country);
                acc2+=1;
            }
        }
        System.out.println("The total amount of countries in the list is " + acc2);
    }
}
