package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
Write a program that will print out month name by receiving a number.
Use switch statement for conditions.
Example:
Display message: "Enter month number:"
input: 5
Display message: "May"
 */

public class replit_054 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number:");
        int numberOfMonths = input.nextInt();


        String month = "";

        switch (numberOfMonths){
            case 1:
                month="January";
                break;
            case 2:
                month="February";
                break;
            case 3:
                month="March";
                break;
            case 4:
                month="April";
                break;
            case 5:
                month="May";
                break;
            case 6:
                month="June";
                break;
            case 7:
                month="July";
                break;
            case 8:
                month="August";
                break;
            case 9:
                month="September";
                break;
            case 10:
                month="October";
                break;
            case 11:
                month="November";
                break;
            case 12:
                month="December";
                break;
            default:
                month="Invalid Number of Months";
        }

        System.out.println(month);
    }
}