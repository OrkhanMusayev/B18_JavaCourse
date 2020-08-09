package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * Write a program that will reverse a string. Your program should reverse a string only 5 characters long. If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console.
 *
 * Example:
 * input: cat
 * output: Too short!
 *
 * Example:
 * input: singularity
 * output: Too long!
 *
 * Example:
 * input: apple
 * output: elppa
 */
public class replit_067 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        String reverseWord = "";
        if(word.length() == 5){ // apple == >> elppa
                                // 01234
            for(int i=word.length()-1;  i >=0; i--){
                reverseWord += word.charAt(i);
            }
        }else if(word.length() < 5){
            System.out.println("Too short!");
        }else{
            System.out.println("Too long!");
        }

        System.out.println(reverseWord);

    }
}
