package SELF_Practice.REPLIT_REPEAT;

/**
 * Write for and while loops so that they print those numbers between 1 and 20 and divisible by 3.
 * Expected Output:  3 6 9 12 15 18
 */
public class replit_082 {

    public static void main(String[] args) {
/*
        for( int i = 1; i <= 20; i++ ){

            if(i  %3 == 0){

                System.out.print(i+", ");
            }
        }

 */

        System.out.println( " ======================================================== ");

        int i = 1;

        while( i <= 20 ){

            if(i % 3 == 0){

                System.out.println(i+", ");
                i++;
            }
        }


    }
}
