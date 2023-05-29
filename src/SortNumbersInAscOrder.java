//https://edabit.com/challenge/WM5s7vuHnXdcKCEjS

import java.util.Arrays;

public class SortNumbersInAscOrder {
    public static void main(String[] args) {
        int[] array = {80, 29, 4, -95, -24, 85};
        int[] sortedArray = sortNumsAscending(array);
    }

    private static int[] sortNumsAscending(int[] nums) {
        try {
            return Arrays.stream(nums).sorted().toArray();
        } catch (IllegalArgumentException | NullPointerException e) {
            return new int[0];
        }
    }
}