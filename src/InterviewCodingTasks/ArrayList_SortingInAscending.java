package InterviewCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write a method that can sort the ArrayList in Ascending order without using the sort method
 */
public class ArrayList_SortingInAscending {

    public static void SortingArrayListAsc(ArrayList<Integer>list){

        // ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(10,5,-1,-78,55,100));

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);//10

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(10,5,-1,-78,55,100));
        SortingArrayListAsc(list);

    }
}
