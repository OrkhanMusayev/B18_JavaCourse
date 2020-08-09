package day07_IfStatements;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class If_Else_Statements {
    public static void main(String[] args) {

        int number = 0;

        if (number >= 0) {
            System.out.println(number + " is positive");
        }
        if (number < 0) {
            System.out.println(number + " is negative");
        }

        // ELSE METHOD
        if (number >= 0) {
            System.out.println(number + " is positive");
        } else {
            System.out.println(number + " is negative");
        }
        System.out.println("====================================================================================");

        int number2 = 100;
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        }
        if (number % 2 !=0) {

        }

        // ELSE METHOD
        if(number % 2 == 0){

            System.out.println(number + " is even number");

        } else { // Means OTHERWISE

            System.out.println(number + " is odd number");
        }

        System.out.println("===============================================================");

        int age = 30;
        if(age>=21){
            System.out.println("Here is your Vodka");
        } else {
            System.out.println("Here is your Milk");
        }

        boolean testedPositiveForCorona = true;
        if(testedPositiveForCorona){
            System.out.println("Buy more toilet papers and stay at home");
        } else {
            System.out.println("Come to work");
        }






        }

    }
