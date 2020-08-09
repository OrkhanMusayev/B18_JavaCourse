package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * Given a String variable sentence, write code to type each word in separate lines in a reverse order.
 * Example:
 * sentence -> "Java is fun"
 * Print
 * fun
 * is
 * Java
 */
public class replit_102 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] reverse = sentence.split("");
        for(int i=reverse.length-1;i>=0;i--){
            System.out.println(reverse[i]);
        }

    }
}
