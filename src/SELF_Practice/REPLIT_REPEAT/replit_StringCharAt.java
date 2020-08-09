package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
using charAt method output the 3rd letter of txt string then the 5th letter then the 6th letter.

use print not println.
 */

public class replit_StringCharAt {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String txt = s.next();

        /**We need 3rd,5th and 6th letter from the text
         * 3rd letter index number is 2
         * 5th letter index number is 4
         * 6th letter index number is 5
         *
         * Example : Azerbaijan ==>> length is 10(Length-1 will return index Number)
         * indexNum  0123456789
         */
// FIRST WAY
//        char ch1 = txt.charAt(2);
//        char ch2 = txt.charAt(4);
//        char ch3 = txt.charAt(5);
//
//        System.out.print(ch1);
//        System.out.print(ch2);
//        System.out.print(ch3);

        // SECOND WAY

        for(int i=0; i<txt.length();i++){
            if(i==2 || i==4 ||i==5){
                System.out.print(txt.charAt(i));
            }
        }





    }
}
