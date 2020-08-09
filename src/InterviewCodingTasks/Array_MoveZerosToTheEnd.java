package InterviewCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
 *
 * Ex:
 *
 * input:  {1,0,2,0,3,0,4,0};
 *
 * output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
public class Array_MoveZerosToTheEnd {

    public static int[] moveZeros( int[]  arr ) {

        ArrayList<Integer> list = new ArrayList<>();

        int countZero = 0;

        for(int each: arr) {

            list.add(each);

            countZero+= (each==0)?1:0;

        }
        list.removeAll(Arrays.asList(0));

        arr = new int[arr.length];

        for(int i=0; i <arr.length-countZero; i++ ) {

            arr[i] = list.get(i);

        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr1 = {0,10,0,5,8,0,1,0};
        int[] arr2 = moveZeros(arr1);
        System.out.println((Arrays.toString(moveZeros(arr1))));
    }
}
