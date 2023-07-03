//https://edabit.com/challenge/TM5f33Mpu52m2jcat

import java.util.Arrays;

public class MaximumPossibleTotal {
    public static void main(String[] args) {

        int[] array = {1, 1, 0, 1, 3, 10, 10, 10, 10, 1};

        int maxTotal = makeMaxTotal(array);
        System.out.println(maxTotal);
    }

    private static int makeMaxTotal(int[] array) {

        int sum = 0;

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        for (int i = array.length - 1; i >= array.length - 5; i--) {
            sum += array[i];
        }
        return sum;
    }
}