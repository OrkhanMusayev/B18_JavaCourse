package WarmpUpTasks.Night_WarmUp;

import java.util.Arrays;

/**
    1. write a method that can return the maximum number from an int array
    2. write a method that can return the maximum number from a double array
            NOTE: MUST apply method overloading
    3. write a method that can return the minimum number from an int array
    4. write a method that can return the minimum number from a double array
            NOTE: MUST apply method overloading

    5. write an int[] return method that can sort an int array in descending order
    6. write a double[] return method that can sort a double array in descending order
    7. write a char[] return method that can sort a char array in descending order
           NOTE: MUST apply method overloading
 */

public class TaskSolution_04_21_2020 {

    public static void main(String[] args) {

        int[] arr = {100, 40, 500, 50, 30, -5, -100};
        int num1 = maxNum(arr);
        System.out.println(num1);

        System.out.println("===================================================");

        double[] arr2 = {5.5, 6.5, 7.5, 8.5, 9.5, 10.5};
        double num2 = maxNum2(arr2);
        System.out.println(num2);

        System.out.println("===================================================");

        int[] arr3 = {5, 1, 7, 11, 9, 93, 55};
        int num3 = minNum(arr3);
        System.out.println(num3);

        System.out.println("===================================================");

        double[] arr4 = {5.5, 1.5, 7.5, 11.5, 9.5, 93.5, 55.5};
        double num4 = minNum2(arr4);
        System.out.println(num4);

        System.out.println("===================================================");


    }

    public static int maxNum(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];

    }

    public static double maxNum2(double[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];


    }

    public static int minNum(int[] arr) {
        Arrays.sort(arr);
        return arr[0];

    }

    public static double minNum2(double[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }


    }

