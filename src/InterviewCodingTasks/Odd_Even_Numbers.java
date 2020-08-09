package InterviewCodingTasks;

/**
 * Write  a method which can identifies given number is even or odd
 */
public class Odd_Even_Numbers {

    public static String identifyOddEven(int n){

        return n%2==0 ? "Even" : "odd" ;

    }

    public static void main(String[] args) {

        System.out.println(identifyOddEven(8));
    }
}
