package day13_StringClass;

/**
 * /*
 *         Assignment :
 *             Write me a program that asks the user first and last names,then prints the initials.
 *
 *             example:
 *                    input:
 *                          cybertek
 *                           school
 *
 *                    output:
 *                            CS
 *          */

import java.util.Scanner;

public class ClassTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String Name = input.nextLine(); // assume this is my input orkhan musayev ==> OM
        System.out.println("Enter your last name");
        String lastName = input.nextLine();
        String a = Name.substring(0,1).toUpperCase();
        String b = lastName.substring(0,1).toUpperCase();

        System.out.print(a);
        System.out.print(b);




    }
}
