package day15_FoorLoop;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        /*
1. write a program that asks user's first and last name,
then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        // 1th way

        String initials1 = firstName.substring(0,1).toUpperCase() + lastName.substring(0,1).toUpperCase();

        System.out.println(initials1);


        String initials2 = ""+firstName.charAt(0)+lastName.charAt(0); // returns string
        initials2 = initials2.toUpperCase();


        System.out.println(initials2);






    }
}
