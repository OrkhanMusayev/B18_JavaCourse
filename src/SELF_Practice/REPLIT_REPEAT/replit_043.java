package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
Write a program that will return mid number out of three numbers.  No need to do any calculations.


Example 1:
Display prompt: "Enter first number:"
14
Display prompt: "Enter second number:"
52
Display prompt: "Enter third number:"
25
Display prompt: "Medium value is: 25"

Example 2:
Display prompt: "Enter first number:"
140
Display prompt: "Enter second number:"
34
Display prompt: "Enter third number:"
1
Display prompt: "Medium value is: 34"
 */

public class replit_043 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        System.out.println("Enter third number:");
        int num3 = input.nextInt();



        if(num1>num2 && num1<num3){
            System.out.println("Medium value is " + num1);
        }else if(num2>num1 && num2<num3){
            System.out.println("Medium value is " + num2);
        }else{
            System.out.println("Medium value is " + num3);
        }





    }
}
