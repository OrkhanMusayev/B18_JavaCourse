package SELF_Practice;

import java.util.Scanner;

public class day12_Assignment {
    /*
 Assignment:
write a program that asks to enter 5 numbers and prints the numbers in ascending order
   Ex:
    5, 4, 1, 2, 3
   output:
     1, 2, 3, 4, 5
         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter tree numbers");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int greatestNum = (num1>num2 && num1>num3)? num1 : (num2>num1 && num2>num3)? num2 : num3;
        int smallestNum = (num1<num2 && num1<num3)? num1 : (num2<num1 && num2<num3)? num2 : num3;
        int middleNum = (num1<num2 && num1>num3 || num1>num2 && num1<num3)? num1
                : (num2<num1 && num2>num3 || num2>num1 && num2<num3)? num2 : num3;

        System.out.println(smallestNum + "\n" + middleNum + "\n" + greatestNum);









    }


}
