package SELF_Practice.REPLIT_REPEAT;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Given an int array of any length, print a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
 *
 * Example:
 * input 1, 2, 3
 * output: [1, 2]
 *
 * Example:
 * input 1,
 * output: [1]
 */
public class ArraysFrontPiece {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        ArrayList<Integer> list=new ArrayList<>();
        if (num.length>=2){
            for (int i=0;i<2;i++){
                list.add(num[i]);
            }}
        if (num.length==1){
            list.add(num[0]);
        }
        System.out.println(list);
    }
}

