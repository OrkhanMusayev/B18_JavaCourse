package SELF_Practice.REPLIT_REPEAT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**

Switch the last element in an array with the first and return the array.

example:

do_switch([1,2,3,4])
returns:[[4,2,3,1]

do_switch([7,2,3,5])
returns:[5,2,3,7]
 */
public class SwitchElements {


    public static void main(String[] args) {

    }
    public static int[] do_switch(int[] i){

        ArrayList<Integer> list=new ArrayList<>();

        for (int k=0;k<i.length;k++){
            list.add(i[k]);
        }
        Collections.swap(list,0,list.size()-1);
        for (int k=0;k<list.size();k++){
            i[k]=list.get(k);
        }
        return i;
    }
    }
