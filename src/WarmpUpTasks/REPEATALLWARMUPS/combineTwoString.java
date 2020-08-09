package WarmpUpTasks.REPEATALLWARMUPS;

import java.util.Scanner;

/**
 * /* 1. Ask user to enter two words.
 *             Print the first word, second word, second word, first word
 *         Input:
 *         one
 *                 two
 *         Output:
 *         onetwotwoone
 *         DO NOT USE + OPERATOR
 *
 *        */


public class combineTwoString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = input.next();

        System.out.println("Enter second word");
        String word2 = input.next();

        String result1 = word1.concat(word2).concat(word2).concat(word1);
        String result2 = word1.concat(" "+word2).concat(" "+word2).concat(" "+word1);// output with space between
        System.out.println(result1);
        System.out.println(result2);







    }
}
