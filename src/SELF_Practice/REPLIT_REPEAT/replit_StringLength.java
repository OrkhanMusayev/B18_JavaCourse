package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * ask the user for his name, capture it on a string using scanner.
 * then output the length of the name string.
 */
public class replit_StringLength {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.next();
        int lengthOfName = name.length();
        System.out.println(lengthOfName);



    }
}
