package SELF_Practice.Loop;

import day11_Scanner.ScannerClass;

import java.util.Scanner;

public class MinNum_Task_04_04_2020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min =1000000000;
        for(int i=1; i<=5; i++){
            System.out.println("Enter 5 number");
            int num = input.nextInt();
            if(num<min){
                min = num;
            }
            System.out.println("Minimum number is "+min);




        }







    }
}
