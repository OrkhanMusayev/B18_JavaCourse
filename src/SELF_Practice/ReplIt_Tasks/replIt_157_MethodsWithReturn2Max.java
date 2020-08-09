package SELF_Practice.ReplIt_Tasks;
/**
max function gets two ints, x and y.
x is the test case, y is what we test against.

if  x is bigger then y return y
in any other case return x.

for example:

max(1,10)
returns 1

max(11,5)
returns 5
 */

public class replIt_157_MethodsWithReturn2Max {

    public static int max(int x, int y) {


        int max = (x > y) ? y : x;
        return max;

    }

    public static void main(String[] args) {

        int result = max(10,20);
        System.out.println(result);

    }
}