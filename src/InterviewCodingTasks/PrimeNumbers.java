package InterviewCodingTasks;

/**
 * Write a method that can check if a number is prime or not
 */
public class PrimeNumbers {

    public static boolean primeNumber(int num) {

        boolean result = true;


        for(int i = 2; i < num; i++) {
            if(num % i == 0 ) {
                result = false;
            }
        }
        return result;
}

    public static void main(String[] args) {

        System.out.println(primeNumber(17));
    }
    }
