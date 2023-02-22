package HomeTask8;

public class Task3 {
    public static void main(String[] args) {
        String[][] groceryList = {{"cucumbers", "tomatoes", "avocadoes"},
                                  {"apples", "blueberries", "tangerins"},
                                  {"cookies", "candies", "apple pie", "dark chocolate"} };

        // LOOP #1
        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.println(groceryList[i][j]);
            }
        }
        System.out.println("******************************");
        //LOOP #2

        for(String[] type: groceryList) {
            for (String product: type) {
                System.out.println(product);
            }
        }
    }
}
