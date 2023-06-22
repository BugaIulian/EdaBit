//https://edabit.com/challenge/sPz2LcPZyAiBHRgwX
public class PhoneNumberFormatting {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String phoneNumber = formatPhoneNumber(numbers);
        System.out.println(phoneNumber);
    }

    private static String formatPhoneNumber(int[] numbers) {
        StringBuilder phoneNumber = new StringBuilder();
        phoneNumber.append('(');
        for (int index = 0; index < numbers.length; index++) {
            if(index == 3) {
                phoneNumber.append(") ");
            } else if (index == 6) {
                phoneNumber.append("-");
            }
            phoneNumber.append(numbers[index]);
        }
        return phoneNumber.toString();
    }
}