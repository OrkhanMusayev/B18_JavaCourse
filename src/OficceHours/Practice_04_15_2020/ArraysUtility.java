package OficceHours.Practice_04_15_2020;

import java.util.Arrays;

public class ArraysUtility {
    /*
    Arrays.sort(arr): sorts the array in Ascending order
    Arrays.equal(arr1,arr2): arr1 == arr2
    Arrays.toString(): converts single dimensional array to string

    Arrays.deepToString(): converts multi-dimensional array to string
     */
    public static void main(String[] args) {

        int [] arr = {9,10,8,65,8,6,5};
        Arrays.sort(arr); // [5, 6, 8, 8, 9, 10, 65]
        System.out.println(Arrays.toString(arr));

        int [] salaries = {2000,151,45,3000,58444,7888,9500000,130000 };
        int length = salaries.length;
        int lastIndex = length-1;

        Arrays.sort(salaries); // ascending
        System.out.println(Arrays.toString(salaries));

        System.out.println("Minimum salary: " + salaries[0] );
        System.out.println("Maxmimu salary: " + salaries[lastIndex]);

        System.out.println("=================================================");

        int[] arr1 = {3,2,1};
        int[] arr2 = {2,1,3};

        Arrays.sort(arr1); // {1,2,3}
        Arrays.sort(arr2); // {1,2,3}
        System.out.println(Arrays.equals(arr1,arr2)); // true, false
























    }
}
