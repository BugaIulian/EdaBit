import java.util.Arrays;

//https://edabit.com/challenge/akHQKSkHT26TuA7Ka
public class Top3Programmers {
    public static void main(String[] args) {
      int result =  programmers(147, 33, 526);
    }

    private static int programmers(int one, int two, int three) {
        int[] array = {one, two, three};
        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        return sortedArray[sortedArray.length - 1] - sortedArray[0];
    }
}