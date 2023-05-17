//https://edabit.com/challenge/FSKb2sKrGoejfJLrd
public class LessThan100 {
    public static void main(String[] args) {
        int n1 = 89;
        int n2 = 10;

        boolean check = lessThan100(n1, n2);
        System.out.println(check);
    }

    private static boolean lessThan100(int n1, int n2) {

        return (n1 + n2) < 100;
    }
}