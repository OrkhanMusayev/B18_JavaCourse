package WarmpUpTasks.REPEATALLWARMUPS;

import java.util.Scanner;

public class Palindrome2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String word = input.nextLine(); // Java
                                       //  0123
        String reverseWord =""; //avaJ

        for(int i=word.length()-1; i >= 0;i--){
             reverseWord += word.charAt(i);
        }

        //boolean palindrome = word.equalsIgnoreCase(reverseWord); to check word is palindrome or no
        // palindrome word for example : level,anna
        System.out.println(reverseWord);


    }
}
