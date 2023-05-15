/* https://edabit.com/challenge/vFLhYANAZQGKTtxA2 **/
public class AddingNumbers {
    public static void main(String[] args) {
        add("111", "111");
    }

    public static String add(String a, String b) {
        try {
            if (!a.isEmpty() && !b.isEmpty()) {
                return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
            }
            return "Invalid Operation";
        } catch (NullPointerException e) {
            return "Invalid Operation";
        }
    }
}