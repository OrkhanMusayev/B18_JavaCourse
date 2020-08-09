package WarmpUpTasks;

import java.util.Scanner;
/*
1. write a program that asks user's first and last name,
then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB
 */
public class String_04_02_2020 {

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        // 1th way
        /*
        String initials = firstName.substring(0,1).toUpperCase() + lastName.substring(0,1).toUpperCase();
        initials = initials.toUpperCase();
        */

        String initials = ""+firstName.charAt(0)+lastName.charAt(0); // returns string
        initials = initials.toUpperCase();


        System.out.println(initials);









    }
}
