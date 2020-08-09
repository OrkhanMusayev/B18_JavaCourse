package day07_IfStatements;
/*
3. write a java program that accepts three numbers and return the minimum number
        (assume that none of them are equal)

 */

public class MinNumber {
    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 400;

        boolean aMinimum = a < b && a < c; // if a is less than both b and c,then a is the minimum
        boolean bMinimum = b < a && b < c; // if b is less than both a and c,then b is the minimum
        boolean cMinimum = c < a && c < b; // if c is less than both b and a,then c is the minimum

        if(aMinimum){
            System.out.println(a + " Is minimum number");
        }
        if(bMinimum){
            System.out.println(b + " Is minimum number");
        }
        if(cMinimum){
            System.out.println(c + " Is minimum number");
        }

    }
}
