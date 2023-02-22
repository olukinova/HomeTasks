package HomeTask8;

public class Task4 {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3}, {4,5,6}, {7,8,9}};
        int sum = 0;
        //Loop #1
        for (int i = 0; i < numbers.length; i++)
            for(int j = 0; j < numbers[i].length; j++) {
               sum += numbers[i][j];
            }
        System.out.println(sum);
        //Loop #2
        int sum2 = 0;
        for(int[] set: numbers) {
            for(int number: set) {
                sum2 += number;
            }
        }
        System.out.println(sum2);





    }
}
