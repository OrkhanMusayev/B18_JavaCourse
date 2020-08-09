package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 Write a program that will verify if word contains in the sentence.
 Print out the result as boolean value.
 */

public class replit_060 {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE

        boolean wordInTheSentence = sentence.contains(word);
        System.out.println(wordInTheSentence);

    }
}
