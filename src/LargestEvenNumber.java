//https://edabit.com/challenge/FDauhMn4rAcsW7Goh

import java.util.Arrays;

public class LargestEvenNumber {
    public static void main(String[] args) {

        int[] array = {3, 7, 21, 1, 7, 9, 1, 13};
        probe(array);
    }

    private static int probe(int[] array) {

        try {
            return Arrays.stream(array)
                    .filter(x -> x % 2 == 0)
                    .max()
                    .getAsInt();
        } catch (RuntimeException e) {
            return -1;
        }
    }
}