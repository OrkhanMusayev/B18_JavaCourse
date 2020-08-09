package WarmpUpTasks.Night_WarmUp;

import java.util.ArrayList;
import java.util.Arrays;

/**
 Write a program that can move all the zeros to  last indexes of ArrayList
        Ex:
            list:  {1, 0, 2, 0, 3, 0, 4, 0};
            output: [1, 2, 3, 4, 0, 0, 0, 0]
            DO NOT USE SORT method, DO NOT declare any extra arrayList
 */
public class TaskSolution_04_30_2020 {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>((Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0)));
        for (int i=0;i<list.size();i++){
            if(list.get(i).equals(0)){
                list.remove(list.get(i));
                list.add(0);
            }
        }
        System.out.println(list);

        System.out.println("=====================================================================");



        /**
        write a program that can return the duplicated values from an ArrayList of String
        Ex:
            list: {"A", "B", "A", "C", "D"};
            output: ["A"]
            list: {"A", "B", "B", "C", "D", "D"};
            output: ["B", "D"]
         */

        ArrayList<String> list1 =new ArrayList<>((Arrays.asList("A", "B", "A", "C", "D")));

        ArrayList<String> dup = new ArrayList<>();
        for (String each2 : list1) {
            int count = 0;
            for (String each : list1) {
                if (each.equals(each2)) {
                    count++;
                }
            }
            if (count >= 2) {
                dup.add(each2);
            }
        }
        System.out.println(dup);


    }
}
