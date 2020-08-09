package day44_Exceptions;

public class Unchecked {

    public static void main(String[] args) {
        System.out.println("Test started");
        // System.out.println(9/0); // error ArithmeticException: / by zero

        String str = "Cybertek";

        //    System.out.println( str.charAt(-1) );

        int[] arr = {1,2,3};
        System.out.println( arr[200] );
        System.out.println("Test completed"); // you can not run the code after error message
    }
}
