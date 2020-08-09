package SELF_Practice.StringClass_Manipulations;
/*
  Assignment :
    Write me a program that asks the user first and last names,then prints the initials.

       example:
            input:
               cybertek
                school

                   output:
                           CS
         */

import java.util.Scanner;

public class StringManipulations_Assignment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.nextLine();

        System.out.println("Enter your last name");
        String lastName = input.nextLine();

        String initials = firstName.substring(0,1).toUpperCase()+lastName.substring(0,1).toUpperCase();
        System.out.println(initials);





    }
}
