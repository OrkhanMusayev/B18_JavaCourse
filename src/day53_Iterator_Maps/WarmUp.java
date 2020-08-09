package day53_Iterator_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * 1. write a program that remove the duplicates from an array of String
 * 	2. write a program that can remove the duplicates from an arrayList of String
 */
public class WarmUp {

    public static void main(String[]args){
//        String str = "AGABABAB";//
//        String[] arr= str.split("");
//
//        LinkedHashSet<String> linkedHashSet  =new LinkedHashSet<>();
//        linkedHashSet.addAll(Arrays.asList(arr));
//
//        HashSet<String> hashSet =new HashSet<>(Arrays.asList(arr));
//
//        System.out.println(linkedHashSet);
//        System.out.println(hashSet);


        String[] arr = {"E", "B", "A", "D", "D", "C", "A"}; //EBADC
        LinkedHashSet<String> list = new LinkedHashSet(Arrays.asList(arr));
        System.out.println(list);

        System.out.println("====================================================");

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("E", "B", "A", "D", "D", "C", "A"));
        LinkedHashSet<String> st2 = new LinkedHashSet<>(list2);
        System.out.println(st2);

    }
}
