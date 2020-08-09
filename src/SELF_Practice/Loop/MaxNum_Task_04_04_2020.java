package SELF_Practice.Loop;

import java.util.Scanner;

public class MaxNum_Task_04_04_2020 {
    /*
    1. write a program that can ask the user "enter a number"
    five times and return the maximum number
   hint: you will need for loop and if statement
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        for (int i = 0; i<5; i++){
            System.out.println("Enter a number");
            int a = input.nextInt();
            if (max<a){
                max = a;
            }
        }
        System.out.println("Maximum number is "+max);
    }
}

