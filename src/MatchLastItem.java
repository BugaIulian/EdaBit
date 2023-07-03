//https://edabit.com/challenge/tQ26d2JJkxpjszfsk

public class MatchLastItem {
    public static void main(String[] args) {

        String[] items = {"i", "love", "tesh", "ilovetesh"};

        boolean matchLast = matchLastItem(items);
    }

    private static boolean matchLastItem(String[] items) {
        StringBuilder strings = new StringBuilder();

        for (int i = 0; i < items.length - 1; i++) {
            strings.append(items[i]);
        }
        return strings.toString().equals(items[items.length - 1]);
    }
}