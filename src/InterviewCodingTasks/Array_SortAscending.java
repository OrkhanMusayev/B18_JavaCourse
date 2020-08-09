package InterviewCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * Write a return method that can sort an int array in Ascending order
 *      without using the sort method of the Arrays class
 */
public class Array_SortAscending {


    public static void SortingArrayAsc(int[] arr) {

        ArrayList<Integer> list = new ArrayList();

        for(int each: arr) {

            list.add(each);

        }

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }

        for(int i=0; i < list.size(); i++) {

            arr[i] = list.get(i);

        }

    }

    public static void main(String[] args) {


        int[] a= {10, 9, 8, 7};
        TreeSet<Integer> set=new TreeSet<>();
        for (int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        System.out.println(set);

        int[] arr = {0,15,22,87,1,5,7,9,4};
        SortingArrayAsc(arr);
        System.out.println(Arrays.toString(arr));
    }
}
