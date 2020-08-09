package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * Write a program that will print out last letter of the word (string).
 */
public class replit_060_PrintLastCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next(); // Orkhan == > last letter is n
        //WRITE YOUR CODE HERE

        System.out.println(word.charAt(word.length()-1));
    }
}
