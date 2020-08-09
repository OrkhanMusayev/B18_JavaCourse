package WarmpUpTasks.REPEATALLWARMUPS;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Scanner;

/**
write a program that asks user's first and last name,
then prints out the initials of the user
Ex:
    input:cybertek
          batch18
output:
    your initial is: CB
 */
public class InitialsOfTheUser {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = scan.next();

        System.out.println("Enter second name");
        String lastName = scan.next();

        String result = firstName.substring(0,1).toUpperCase()+lastName.substring(0,1).toUpperCase();

        //String finalResult = result.toUpperCase(); // SECOND WAY

        //String initials = "" + firstName.charAt(0) + lastName.charAt(0); // THIRD WAY

        System.out.println(result);

    }
}
