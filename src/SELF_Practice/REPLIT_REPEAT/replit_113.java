package SELF_Practice.REPLIT_REPEAT;

/**
 * Write a for loop that prints all the even integers from 80 through 20 inclusive, separated by spaces.
 * MUST USE FOR EACH LOOP
 */
public class replit_113 {

    public static void main(String[] args) {

        String result="";

        for (int i=80;i>=20;i--) {
            if (i % 2 == 0) {
                result = result + i + " ";
            }
        }

        String [] words = result.split(" ");
        for (String each:words) {
            System.out.print(each+" ");
        }

    }
}
