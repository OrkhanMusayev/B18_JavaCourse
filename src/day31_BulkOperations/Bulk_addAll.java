package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        /*
                    list1.add(30);
                    list1.add(20);
                    list1.add(40);
                    list1.add(50);
                    list1.add(45);
                    list1.add(35);
                    list1.add(200);
         */

       //  list1.addAll(Arrays.asList(30, 20, 40, 50, 45, 35, 200)); you can do this way or

        // int [] arr1 = {30, 20, 40, 50, 45, 35, 200}; // we can not use int because addAll method only accept collection type
        Integer[] arr1 = {30, 20, 40, 50, 45, 35, 200};
        list1.addAll(Arrays.asList(arr1));
        System.out.println(list1);

        System.out.println("========================================================================================================");

        String[] names = {"Orkhan","Yegana","Aisha","Amar","Shamil"};
        //                  0         1       2      3        4
        // names[5]= "Ramazan"; we can not add to the array, because we can not change it
        System.out.println(Arrays.toString(names));

        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll( Arrays.asList(names) );
        //                     collectionType
        System.out.println(namesList);
        namesList.add("Ramazan"); // now we can add any String to the arrayList,but make sure it should case sensitive
        namesList.remove("Shamil"); // we can remove from arrayList but we can not remove from regular array
        System.out.println(namesList);

        System.out.println("========================================================================================================");

        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10}; // we can not use int,because it does not support primitive
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers));

        System.out.println(numList);
        





    }
}
