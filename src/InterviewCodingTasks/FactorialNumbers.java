package InterviewCodingTasks;

/**
 * Write a return method that returns the factorial number of any given number
 */
public class FactorialNumbers {

    public static int factorialNumber(int n){

        int result = 1;

        for(int i = 1; i <= n; i++){

            result = result * i;

        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(factorialNumber(4));
    }
}
