package SELF_Practice.REPLIT_REPEAT;

/**
Write a program that will print a week day according to the day number.
Use switch statement.
 Example
 Display message: "Enter number:"
 1
 Display message: "Monday"
 */

import java.util.Scanner;

public class replit_055 {

    public static void main(String[] args) {


        //WRITE YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int numOfDay =input.nextInt();

        String result ="";

        switch (numOfDay){
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid week day!";

        }

        System.out.println(result);

    }


}
