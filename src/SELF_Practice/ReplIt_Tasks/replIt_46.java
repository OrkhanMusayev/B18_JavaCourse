package SELF_Practice.ReplIt_Tasks;

import java.util.Scanner;

public class replIt_46 {
    public static void main(String[] args) {
        //DO NOT CHANGE
        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        num = input.nextInt();
        digit1 = num%10;
        num = num/10;
        digit2 = num%10;
        num = num/10;
        digit3 = num%10;
        num = num/10;
        digit4 = num%10;
        num = num/10;
        digit5 = num%10;


        System.out.println("Display prompt: "+digit5);
        System.out.println("Display prompt: "+digit4);
        System.out.println("Display prompt: "+digit3);
        System.out.println("Display prompt: "+digit2);
        System.out.println("Display prompt: "+digit1);




    }
}

