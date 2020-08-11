package Edabit;

/**
 * Create a function that takes a number as an argument and returns the amount of digits it has.
 *
 * Examples
 * findDigitAmount(123) ➞ 3
 *
 * findDigitAmount(56) ➞ 2
 *
 * findDigitAmount(7154) ➞ 4
 *
 * findDigitAmount(61217311514) ➞ 11
 *
 * findDigitAmount(0) ➞ 1
 */
public class FindtheTotalNumberofDigitstheGivenNumberHas {

    public static int findDigitAmount(int num) {
        String x = Integer.toString(num);
        return x.length();
    }

    public static void main(String[] args) {

        System.out.println("findDigitAmount() = " + findDigitAmount(1993));
    }
}
