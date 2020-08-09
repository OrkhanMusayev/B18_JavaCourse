package WarmpUpTasks.REPEATALLWARMUPS;

import java.util.Scanner;

/**
 * 1. write a program that can ask the user "enter a number" five times and return the maximum number
 *                 hint: you will need for loop and if statement
 *
 *     2. write a program that can ask the user "enter a number" five times and return the minimum number
 *                 hint: you will need for loop and if statement
 */
public class Max_Min {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int MaxNumber = -2147483647; //(minimum number of INT) any number the user provided will be greater than this number
                                    // first user entered variable will be initialized to MaxNumber

        int MinNumber = 2147483647; //(maximum number of INT) any number the user provided will be less than this number

        for(int i=1; i <=5; i++){ // i: 1,2,3,4,5

            System.out.println("Enter a number");
            int num = scan.nextInt(); // 0,1,2,3,4

            if(num > MaxNumber){ // to compare each user inputs , and assign the maximum number to MaxNumber
                MaxNumber = num;
            }

            if( num < MinNumber ){

                MinNumber = num;
            }
        }

        System.out.println("Maximum Number: " + MaxNumber);
        System.out.println("Minimum Number: " + MinNumber);

    }
}
