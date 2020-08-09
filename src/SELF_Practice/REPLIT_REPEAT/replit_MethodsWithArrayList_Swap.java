package SELF_Practice.REPLIT_REPEAT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * In this assignment you will swap a position in an array list with another.
 *
 * swap gets 3 arguments, an arraylist, a position, and another position to swap with.
 *
 * for example:
 *
 * swap(["one","two","three"],0,2)
 * returns:["three","two","one"]
 *
 *
 * swap(["a","c","b","d","e"],0,3)
 * returns:["d","c","b","a","e"]
 */

public class replit_MethodsWithArrayList_Swap {

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2){

// FIRST WAY
//        String  a=list.get(pos1);
//        String  b=list.get(pos2);
//        list.set(pos1,b);
//        list.set(pos2,a);
//        System.out.println(list);
//        return list;

        Collections.swap(list,pos1,pos2);
        return list;


    }

    public static void main(String[] args)
    {

        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("one","two","three"));
        swap(wordList,0,2);
        System.out.println(wordList);

    }//end main
}

