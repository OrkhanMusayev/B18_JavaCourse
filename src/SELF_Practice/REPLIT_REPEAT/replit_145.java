package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * Create a method called plus_minus that gets an array of ints (int[]), it outputs how many negative , positive and zero numbers are in the array.
 *
 * for example:
 *
 * plus_minus (new int[]{1,2,55,-9,-2,0});
 *
 * will output:
 * positives:3, negatives:2, zeros:1
 */
public class replit_145 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++){

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main

    public static void plus_minus(int[]arr){

        int positives=0;
        int negatives=0;
        int zeros=0;

        String result="";

        for (int i=0; i<arr.length;i++){
            if(arr[i]>0){
                positives++;
            }else if (arr[i]<0){
                negatives++;
            }else{
                zeros++;
            }
        }

        result += "positives:"+positives+", negatives:"+negatives+", zeros: "+zeros;
        System.out.println(result);
    }
}
