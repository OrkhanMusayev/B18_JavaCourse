package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println(max);
        System.out.println(min);

        /**
         * 1. write a program that can return the second maximum number from ArrayList
         *   Ex : {1,2,3,4,5,6,7,8,8};
         *        output : 7
         * 2 write a program that can return the second minimum number from ArrayList
         *   Ex : {1,1,2,3,4,5,6,7,8,8};
         *        output: 2
         */



        System.out.println("=================================");
        ArrayList<Integer> numbers = new ArrayList<>( Arrays.asList(1,2,3,4,5,6,7,8,8));
        // second max: 7

        Integer maxNum = Collections.max(numbers);  //8

        numbers.removeAll( Arrays.asList(maxNum) );

        System.out.println(numbers);


        int secondMax= Collections.max(numbers) ;

        System.out.println(secondMax);

        System.out.println("==================================================================");
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8));
        Integer minNum = Collections.min(list2); //1
        // second min number is 2

        list2.removeAll( Arrays.asList( minNum ) );  // removes all the minimum number
        System.out.println(list2);

        int secondMin = Collections.min(list2);
        System.out.println(secondMin);

        System.out.println("==================================================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5)); // {1,2,3,4,5}
         //                                         0 1 2 3 4

        System.out.println(list3);
        Collections.swap(list3, 0,4); // {5,4,3,2,1}
        System.out.println(list3);


        System.out.println("==================================================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Orkhan","Orkhan","Amar","Aisha","Yegana","Orkhan"));
        //                            0         1      2       3        4       5
        /*
        names.set(0,"Shamil");
        names.set(1,"Shamil");
        names.set(5,"Shamil");

        */

        Collections.replaceAll(names,"Orkhan","Shamil");
        System.out.println(names);












    }
}
