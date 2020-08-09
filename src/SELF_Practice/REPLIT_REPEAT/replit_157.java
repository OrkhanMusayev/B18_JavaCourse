package SELF_Practice.REPLIT_REPEAT;

/**
 * max function gets two ints, x and y.
 * x is the test case, y is what we test against.
 *
 * if  x is bigger then y return y
 * in any other case return x.
 *
 * for example:
 *
 * max(1,10)
 * returns 1
 *
 * max(11,5)
 * returns 5
 */
public class replit_157 {

    public static void max(int x,int y){
        if (x>y){
            System.out.println(y);
        }else {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        max(1,10);
        max(10,5);
    }
}
