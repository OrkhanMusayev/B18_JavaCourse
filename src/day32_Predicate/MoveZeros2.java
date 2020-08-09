package day32_Predicate;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *Write a program that can move all the zeros to  last indexes of ArrayList
 * 		Ex:
 * 			list:  {1,0,2,0,3,0,4,0};
 * 			output: [1, 2, 3, 4, 0, 0, 0, 0]
 * 			DO NOT USE SORT method, DO NOT declear  any extra lists
 */


public class MoveZeros2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList (1,0,2,0,3,0,4,0) );
        System.out.println(list);

       int count =  Collections.frequency(list,0); // step 1 - finding how many zero(frequency) do we have in the Array List
        System.out.println(count);

        list.removeAll(Arrays.asList(0)); // step 2 - remove all the zeros from the list
        System.out.println(list);


        for(int i=0; i<count; i++){ // step 3 - depending count (how many zeros) i add all zeros at the end
            list.add(0);
        }

        System.out.println(list);



    }
}
