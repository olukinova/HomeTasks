package HomeTask8;

public class Task5 {
    public static void main(String[] args) {
        int [][] numbers = {{425, 67 ,221, 556}, {464, 666, 923, 993}, {311, 555, 888, 9890}, {1000, 987, 765, 534}};
        for(int[] set: numbers) {
            for(int number: set) {
                if(number%2 == 0) {
                    System.out.println(number);
                }
            }
        }
    }
}
