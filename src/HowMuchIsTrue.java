public class HowMuchIsTrue {

    public static void main(String[] args) {

        boolean[] tOF = {true, false, false, true, false};
        System.out.println(countTrue(tOF));
    }

    public static int countTrue(boolean[] arr) {
        int numOfTrue = 0;
        for (boolean b : arr) {
            if (b) {
                numOfTrue++;
            }
        }
        return numOfTrue;
    }
}
