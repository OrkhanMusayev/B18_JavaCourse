package SELF_Practice.REPLIT_REPEAT;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given a String array words, iterate through each word and print first and last letter of each element in the format below.
 *
 * Example:
 *
 * words → ["hello", "why", "by", "apple" , "note"]
 * print → [ho, wy, by, ae, ne]
 */
public class replit_105 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

// FIRST WAY
        for (int i=0; i<=words.length-1; i++){
            System.out.println( words[i].charAt(0)+""+words[i].charAt(words[i].length()-1));
        }
// SECOND WAY

//        for (int i = 0; i < words.length; i++) {
//            words[i] = "" + words[i].charAt(0) + words[i].charAt(words[i].length() - 1);
//        }
//
//        System.out.print(Arrays.toString(words));



    }
}
