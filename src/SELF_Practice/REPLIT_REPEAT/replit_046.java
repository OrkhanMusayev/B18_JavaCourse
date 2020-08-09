package SELF_Practice.REPLIT_REPEAT;

import java.util.ArrayList;
import java.util.Scanner;

/**
In this task, you need to slice an integer and print numbers one by one from new line.

Create a scanner object

Example # 1
-Display prompt: Enter your number:
12345
-Display prompt: 1
-Display prompt: 2
-Display prompt: 3
-Display prompt: 4
-Display prompt: 5

Example # 2

-Display prompt: Enter your number:
45678
-Display prompt: 4
-Display prompt: 5
-Display prompt: 6
-Display prompt: 7
-Display prompt: 8

Use / and % operators

 */

public class replit_046 {

    public static void main(String[] args) {

        int num, digit1, digit2, digit3, digit4, digit5;

        //WRITE YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        num = input.nextInt();


//FIRST WAY
//        digit1 = num%10; // example : 1%10=0.1 int takes whole number 1
//        num = num/10; // 1/10=0.1 int takes whole number 1
//        digit2 = num%10;
//        num = num/10;
//        digit3 = num%10;
//        num = num/10;
//        digit4 = num%10;
//        num = num/10;
//        digit5 = num%10;
//
//        System.out.println(digit5);
//        System.out.println(digit4);
//        System.out.println(digit3);
//        System.out.println(digit2);
//        System.out.println(digit1);

        // SECOND WAY

        //{1,2,3,4,5}
        String a=""+num;
        ArrayList<String> b=new ArrayList<>();
        for (int i=0;i<a.length();i++){
            b.add(a.substring(i,i+1));
        }
        digit1=Integer.parseInt(b.get(0));
        digit2=Integer.parseInt(b.get(1));
        digit3=Integer.parseInt(b.get(2));
        digit4=Integer.parseInt(b.get(3));
        digit5=Integer.parseInt(b.get(4));

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);







    }
}
