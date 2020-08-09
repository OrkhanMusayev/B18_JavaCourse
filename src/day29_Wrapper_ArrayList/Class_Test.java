package day29_Wrapper_ArrayList;
/*
"True"
"FAlSe"==> to boolean
"1000000000.5"==> to float
"123456" ==> to int
 */


import SELF_Practice.StringClass_Manipulations.STringToLowerCase_tasks;

import java.util.ArrayList;

public class Class_Test {

    public static void main(String[] args) {

        String str1= "True";
        boolean b1 = Boolean.parseBoolean(str1); // Boolean, true
        System.out.println(b1);

        String str2 = "FAlSe";
        boolean b2 = Boolean.parseBoolean(str2);
        System.out.println(b2);

        String str3 = "1000000000.5";
        float f1 = Float.parseFloat(str3);
        System.out.println(f1);

        String str4 = "123456";
        int i1 = Integer.parseInt(str4);
        System.out.println(i1);


        System.out.println("=========================================================");

        /**
        1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list
                Do not use any sorting
         */


        // ArrayList<DataType>  listName = new ArrayList<DataType>();
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        System.out.println(num);

        int maxNum = num.get(4);

        System.out.println(maxNum);


    }

}
