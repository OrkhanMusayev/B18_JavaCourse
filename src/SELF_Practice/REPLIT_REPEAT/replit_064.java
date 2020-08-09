package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * You have a word, do the following:
 *
 * 1. When word has odd number of characters and:
 *             - 3 or more characters, print middle letter
 *       oak ==> a
 *       javav ==> v
 *              - Single character, print that character 3 times
 *       # ==> ###
 *       q ==> qqq
 *
 * 2. When word has even number of characters and:
 *            - 4 or more characters, print middle 2
 *      java ==> av
 *      apples ==> pl
 *      #$%^&* ==> %^
 *            - 2 characters, print those 2 characters twice
 *       @@ ==>@@@@
 *       $$ ==>$$$$
 *       hi ==> hihi
 */
public class replit_064 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        if(word.length() % 2 != 0){

            if(word.length() >= 3){
                System.out.println( word.charAt(word.length() /2 ) ); // input oak /2 ==>a , javav/2 ==> v
            }else{
                System.out.println( word.charAt(0)+""+word.charAt(0)+word.charAt(0) );// print single one  3 times
            }

        }

        if(word.length() % 2 == 0){//if word is even number
            if(word.length() >= 4){//also more than 4 word
                System.out.println( word.charAt(word.length()/2-1)+word.charAt(word.length() /2) );
                // input: java / 2-1 ==> v-1 = a + v == > av
            }else{
                System.out.println( word.concat(word) ); // print twice , input: kk == > kk + kk ==> kkkk
            }
        }





    }
}
