public class ReFormTheWord {

    public static void main(String[] args) {
        System.out.println(getWord("seas","onal"));
    }

    private static String getWord(String left, String right) {
        return left.substring(0,1).toUpperCase() + left.substring(1) + right;
    }
}
