package InterviewCodingTasks;

/**
 * Write a method that can return the sum of the digits in a string
 */
public class SumOFDigitInString {

    public static int sumOfAll(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt("" + str.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        String str ="A5B5C5D5E5";
        System.out.println(sumOfAll(str));

    }
}