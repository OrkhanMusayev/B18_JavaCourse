package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * Given a String variable sentence, write code to type each word in separate lines.
 *
 * Example:
 * sentence -> "Java is fun"
 * Print
 * Java
 * is
 * fun
 */
public class replit_106 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below

        String[] words = sentence.split(" ");

        for (int i=0; i<=words.length-1; i++){
            System.out.println(words[i]);
        }
    }
}
