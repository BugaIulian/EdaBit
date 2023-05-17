//https://edabit.com/challenge/H2MT5bAZ8Guj52zxK

public class FindTheBomb {
    public static void main(String[] args) {
        String answer = bomb("There is a bOmB.");
    }

    private static String bomb(String thereIsABomb) {
        String replaceSpecialCharacters = thereIsABomb.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] stringArrays = replaceSpecialCharacters.split(" ");
        for (String bomb : stringArrays) {
            if (bomb.equalsIgnoreCase("bomb")) {
                return "DUCK!";
            }
        }
        return "Relax, there's no bomb.";
    }
}