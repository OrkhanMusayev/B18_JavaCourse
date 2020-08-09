package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
Write a program that asks user to input int values: areaCode and localNumber.

-Using concatenation put together in this format and assign to String phoneNumber  variable:

-(222)-3334444

-Write a print statement that displays (use phoneNumber variable ):
Calling number (222)-3334444
 */

public class replit_023 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int areaCode = input.nextInt();
        int LocalNumber = input.nextInt();

        String phoneNumber = "("+areaCode+")" + "-" + LocalNumber;
        System.out.println("Calling number "+ phoneNumber);




    }
}
