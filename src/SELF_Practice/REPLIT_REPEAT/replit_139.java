package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * create a static method called "plus", its return is void and it gets no arguments.
 *
 * It asks the user to input two numbers, then it will add them and print the result.
 * Create a scanner within plus method.
 *
 * Example:
 *
 * enter first number:
 * 1
 * enter second number:
 * 2
 * result: 3
 */
public class replit_139 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        plus(num1,num2,'+');
    }

    public static void plus(int num1, int num2, char operator){

        switch (operator){
            case '+':
                System.out.println("result: "+(num1+num2));
        }
    }
}
