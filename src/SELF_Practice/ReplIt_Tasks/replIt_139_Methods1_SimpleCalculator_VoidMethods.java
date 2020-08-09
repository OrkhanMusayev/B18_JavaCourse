package SELF_Practice.ReplIt_Tasks;

/**
 create a static method called "plus", its return is void and it gets no arguments.

 It asks the user to input two numbers, then it will add them and print the result.
 Create a scanner within plus method.

 Example:

 enter first number:
 1
 enter second number:
 2
 result: 3
 */

import java.util.Scanner;

public class replIt_139_Methods1_SimpleCalculator_VoidMethods {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        plus(num1,num2,'+');


    }

    public static void plus(int num1, int num2, char operator){

        switch (operator){
            case '+':
                System.out.println("result: " + (num1+num2));

        }


    }
}
