package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
Write a program that will output length of the text (string).

Example:
Display message: "Please enter the text:"
input: java
Display message: "Length is: 4"
 */
public class replit_058 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the text: ");
        String txt = input.next();
        int lengthOfWord = txt.length();


        System.out.println("Length is: "+lengthOfWord);



    }
}
