//https://edabit.com/challenge/oMCKfdMqgt9kxqA2M
public class RemoveVowels {
    public static void main(String[] args) {
        String removedVowels = removeVowels("Get me to github! ");
        System.out.println(removedVowels);
    }

    private static String removeVowels(String s) {
        String removedVowels = s.replaceAll("[aeiouAEIOU]", "");

        return removedVowels;
    }
}