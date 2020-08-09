package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Methods {

    public static void main(String[] args) {

        // contains(Object): returns boolean

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

       boolean r1 = list1.contains("C"); // "C" is contains in the Array list that's why return true
        System.out.println(r1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("D");
        list2.add("C");
        list2.add("B");

        // Collections.sort(ArrayListName); ==> Ascending order
        Collections.sort(list1); // {A,B,C,D} we use COLLECTIONS class to sort Array List
        Collections.sort(list2); // {A,B,C,D} we use COLLECTIONS class to sort Array List

        boolean r2 = list1.equals(list2);
        System.out.println(r2);


        System.out.println("======================================================================");

        // Array.equal( arr1, arr2 )
        int[] arr1 = {1,2,3};
        int[] arr2 = {3,2,1};
        Arrays.sort(arr1); // {1,2,3}
        Arrays.sort(arr2); // {1,2,3}
        boolean r3 = Arrays.equals(arr1, arr2);
        System.out.println(r3);

        System.out.println("======================================================================");

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(10); // 0
        list3.add(100); // 1
        list3.add(1000); // 2
        list3.add(20); // 3

        // expected result : 1000, 100, 20, 10

        Collections.sort(list3);

        System.out.println(list3);

        ArrayList<Integer> reverseList3 = new ArrayList<>();


        for(int i = list3.size()-1; i >= 0 ;i--){
           // System.out.print(list3.get(i)+" ");
            reverseList3.add( list3.get(i));
        }
        System.out.println(reverseList3);
      //   list3 = reverseList3;

        System.out.println(list3);



        //  isEmpty(): returns boolean, depending on the size
        //				size == 0  ===> true
        //				otherwise ==> false

        list3.clear(); // removes everything , size :0
        boolean r4 = list3.isEmpty();
        System.out.println(r4);









    }
}
