//https://edabit.com/challenge/HDk4PC9w6KPS3X25W

public class RepeatingLettersNTimes {
    public static void main(String[] args) {

        String exitString = repeat("mice", 2);
    }

    private static String repeat(String str, int n) {
        StringBuilder exitStringB = new StringBuilder();
        char[] stringCharacters = str.toCharArray();
        for (char c : stringCharacters) {
            for (int i = 1; i <= n; i++) {
                exitStringB.append(c);
            }
        }
        return exitStringB.toString();
    }
}