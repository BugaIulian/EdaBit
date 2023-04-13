public abstract class CaptureTheRock {

    public static void main(String[] args) {
        String[] rockArray = new String[]{"H3", "H4"};
        String newTestString = "something";
        System.out.println(newTestString.substring(2));
        System.out.println(canCapture(rockArray));
    }

    private static boolean canCapture(String[] rockArray) {
        if (rockArray[0].substring(0, 1).equals(rockArray[1].substring(0, 1))) {
            return true;
        }
        if (rockArray[0].substring(1, 2).equals(rockArray[1].substring(1, 2))) {
            return true;
        }
        return false;
    }
}