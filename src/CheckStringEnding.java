public class CheckStringEnding {

    public static void main(String[] args) {
        checkEnding("feminine", "nine");
    }

    private static boolean checkEnding(String feminine, String nine) {

        return feminine.endsWith(nine) ? true : false;
    }
}
