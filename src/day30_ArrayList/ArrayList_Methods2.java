package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("A"); //0
        list.add("B"); //1
        list.add("C"); //2

        //list.remove(1);
        String str ="B"; // if we give object "Z" boolean expression give us false,because we do not have "Z" object in the String
        boolean b = list.remove(str);// true
        boolean b1 = list.remove("A"); // true, we can directly give "" in the boolean
        System.out.println(list);
        System.out.println(b);
        System.out.println(b1);



        list.clear();// [] remove everything from arrayList
        System.out.println(list);
        System.out.println(list.size()); // size will 0

        System.out.println("===========================================================================");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); // 0
        list1.add(1); // 1
        list1.add(2); // 2
        list1.add(3); // 3
        // {1,1,2,3}

        int num1 = list1.indexOf(1); // 0
        // Integer = int we can assign int to the Integer // AutoBoxing

        System.out.println(num1);


        int num2 = list1.indexOf(100);
        System.out.println(num2); // index number can not be negative number

        int num3 = list1.indexOf(3); // 3
        System.out.println(num3);


















    }
}
