//https://edabit.com/challenge/Wci9YChXWRj6JBeFP

public class Sales {
    public static double discount(int price, int percentage) {
    return price - ((double) (price * percentage) /100);
    }
}