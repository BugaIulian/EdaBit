/* https://edabit.com/challenge/paaguQWznz2cPNCiA **/
public class StringOrInteger {

    public static void main(String[] args) {
        Object object = new StringOrInteger();
        check(object);
    }

    private static String check(Object object) {
        if(object instanceof String) {
            return "str";
        } else if (object instanceof Integer) {
            return "int";
        }
        return "No String or Int datatype detected";
    }
}