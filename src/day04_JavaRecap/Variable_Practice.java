package day04_JavaRecap;

public class Variable_Practice {

    public static void main(String[] args) {
        // DaraType variableNAme = Data;

        byte num1 = 127;
        short num2 = num1;  //double > float > long > int > short > byte

        //    byte num3 = num2;

        int num4 =num2;  // int is prefered by compiler

        long num5 = 99999999999L;

        float num6 = 100L;
        System.out.println(num6);  // 100.0
        // 1. 100, 2. 100L,   3. 100.0

        float num7 = 0.5f;
        System.out.println(num7);  // 0.5

        double num8 = 0.5f;
        double num9 = 9999999L;
        double num10 = 100.5;

        System.out.println(num10);

        char ch1 = '$';  //every single character has a corresponding number
        System.out.println(ch1);  // $

        char ch2 = 4500 ;  // 0 ~ 65565
        System.out.println( ch2 );

        int a1 = '8' ;
        System.out.println(a1); //56

        int a2 = 'z'; // 122
        System.out.println(a2);

        double d1 = 'z' + '8';  //z8, 178, 178.0
        System.out.println(d1);

        char ch3 = 178;
        System.out.println(ch3);

        char ch4 = 'z' + '8';
        System.out.println(ch4);



    }



}
