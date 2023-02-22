package HomeTask12;

public class Task1 {
    int arraySum(int[] array) {
        int sum = 0;
        for(int num: array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {12, 42, 92, 90, 89};
        Task1 sumArr = new Task1();
        int sum = sumArr.arraySum(array);
        System.out.println(sum);

        //OR System.out.println(arraySum(array)) if the method is static creating instance is not required

    }
}
