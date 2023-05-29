import java.util.Arrays;

//https://edabit.com/challenge/Xf7PqJnzukWe2WxqB
public class FindTheSecondLargestNumber {
    public static void main(String[] args) {
        int[] array = {10, 40, 30, 20, 50};
        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        int secondLargest = sortedArray[sortedArray.length - 2];
    }
}
