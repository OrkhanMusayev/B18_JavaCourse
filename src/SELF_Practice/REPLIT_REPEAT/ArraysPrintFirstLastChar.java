package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 *Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
 *
 * Example:
 *
 * words → ["hello", "why", "by", "apple" , "note"]
 * print:
 *        ho
 *        wy
 *        by
 *        ae
 *        ne
 */
public class ArraysPrintFirstLastChar {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

    for (int i=0; i<=words.length-1;i++){
        System.out.println(words[i].charAt(0)+""+words[i].charAt(words.length-1));
        }
}
}
