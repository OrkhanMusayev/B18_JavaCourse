package Edabit;

/**
 * Create a function that takes a number (from 1 to 12) and returns its corresponding month name as a string.
 * For example, if you're given 3 as input, your function should return "March", because March is the 3rd month.
 * monthName(3) ➞ "March"
 * monthName(12) ➞ "December"
 * monthName(6) ➞ "June"
 */
public class Months {

//    public static String months(int num){
//        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
//
//        return months [num-1];
//    }
//
//    public static void main(String[] args) {
//        System.out.println(months(3));
//    }

    public static void main(String[] args) {
        System.out.println(test());
    }
    public static int test() {
        try {
            Thread.sleep(1000);
            return 0;
        }
        catch (InterruptedException e){
            return 5;
        }
        finally {
            System.out.println("finally trumps return.");
            return 6;
        }
    }
}
