package OficceHours.Practice_04_15_2020;

import java.util.Arrays;

public class NestedLoop2 {

  // 1. // print all the odd numbers with regular for loop. MUST use continue statement
  // 2. // print all the even numbers with for each loop.MUST use continue statement

    public static void main(String[] args) {

        int[][] numbers = {
                          {5,4,3,2,1},
                          {10,11,12,13,14,15},
                          {16,17,18,19,20},
        };

        // 1. // print all the odd numbers with regular for loop. MUST use continue statement

        for(int j = 0; j < numbers.length; j++){ // j: index num of 1D arrays

            for(int i = 0; i < numbers[j].length; i++){ // i: index num of elements
                if(numbers[j][i] % 2 == 0){
                    continue;
                }
                System.out.println(numbers[j][i]);

            }
        }

        System.out.println("=================================================================");

        // 2. // print all the even numbers with for each loop.MUST use continue statement

        for(int[] each1DArray: numbers){

            for(int eachElement :each1DArray){
                
                if(eachElement % 2 != 0){
                    continue;
                }
                System.out.println(eachElement);
            }

        }









    }
}
