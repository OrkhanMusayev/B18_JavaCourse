package SELF_Practice.Loop;

import java.util.Scanner;

public class WhileLoop_task {

    public static void main (String [] agrs){

        int apples = 1;
        while(apples <= 10){ // will execute until becoming false
            System.out.println("Eating an apple");
            apples++;//iterator
        }
        System.out.println("No more apples:(");


        System.out.println("======================================");

        int number, count;

        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = keyboard1.nextInt();

        count = 1;
        while (count <= number){
            System.out.print(count + ", ");
            count++;
        }

        System.out.println("==============================================");

        Scanner keyboard2 = new Scanner(System.in);
        int total = 0;
        System.out.println("Enter a positive integer");
        int nextNum = keyboard2.nextInt();

        while(nextNum > 0){
            total = total +nextNum;
            nextNum = keyboard2.nextInt();
        }
        System.out.println("Sum of all numbers: " + total);





    }

}
