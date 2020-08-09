package SELF_Practice;


import java.util.Arrays;

/**
    String str = "AAABBCC" ==> A3B2C2
    [A,A,A,B,B,C,C]
 */

public class TEST {

    public static void main(String[] args){

        int[] x = {100,88,15,25,-10000000,27};
        maxNum(x);
        minNum(x);
        descendingOrder(x);



        }

        /**
         4. create a function that can print the maximum number from any given array
         5. create a function that can print the minimum number from any given array
         6. create a function that can print out the array in descending order
         [1,2,3] == > [3,2,1]

         */


        public static void maxNum(int[] arr){
            Arrays.sort(arr);
            System.out.println("Max number is: " + arr[arr.length-1]);
        }


        public static void minNum(int[] arr){
            Arrays.sort(arr);
            System.out.println("Min number is: " + arr[0]);
        }

        public static void descendingOrder(int[] arr){ // [1,2,3] ==> [3,2,1]
            for(int i=arr[arr.length-1];i>=0;i--){
                System.out.println("Descending order is: " + arr[i]);
            }

            System.out.println();
        }









    }

