public class Operators {
    public static void main(String[] args) {
        operateFunction(6, 2, "%");
    }

    private static int operateFunction(int num1, int num2, String s) {

        return switch (s) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> num1 % num2;
        };
    }
}
