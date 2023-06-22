import java.util.Arrays;

//https://edabit.com/challenge/hymPkXdhmDQLe87QT

public class DifferenceMaxMinNumbersInArray {
    public static void main(String[] args) {
        int[] arrayNumbers = {10, 4, 1, 4, -10, -50, 32, 21};
        int result = differenceMaxMin(arrayNumbers);
    }

    private static int differenceMaxMin(int[] arrayNumbers) {
        Arrays.sort(arrayNumbers);
        return arrayNumbers[arrayNumbers.length - 1] - arrayNumbers[0];
    }
}