package InterviewCodingTasks;

/**
 * Write a return method that returns the  Fibonacci of any given number
 */
public class FibonacciNumbers {

    public static int fib(int num) {

        int result = 0;
        int j = 0;
        int z = 1;

        for (int i = 1; i < num; i++) {

            result = j + z;
            j = z;
            z = result;

        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(fib(5));
    }
}

