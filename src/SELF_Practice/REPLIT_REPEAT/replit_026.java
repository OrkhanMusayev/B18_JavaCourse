package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
in this assignment you are given an int num.
you need to check if num is positive negative or equals to zero.
use 3 if statements to do this .
output if num is positive negative or zero

for example:
num  = 1

print:
"positive"

num = -6

print:
"negative"

num = 0

print:
"zero"

 */

public class replit_026 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        //your code here

        if(num>0){
            System.out.println("positive");
        }
        if(num<0){
            System.out.println("negative");
        }
        if(num==0){
            System.out.println("zero");
        }




    }
}
