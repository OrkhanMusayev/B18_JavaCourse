package SELF_Practice.REPLIT_REPEAT;

/**
 * isEven method gets a number(int) if its even (2,4,8...) returns true.
 * if its odd return false.
 *
 * for example:
 *
 * isEven(1) --> false
 *
 * isEven(8) --> true
 */
public class replit_158 {

    public static boolean isEven(int num){
        if (num % 2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isEven(9));
    }
}
