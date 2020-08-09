package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * write a program that asks the user for his first name and last name.
 * use a scanner to get the use input.
 */
public class replit_Input {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = input.next();

        System.out.println("Enter last name");
        String lastName = input.next();

        String fullName = firstName+" "+lastName;

        System.out.println(fullName);





    }


}
