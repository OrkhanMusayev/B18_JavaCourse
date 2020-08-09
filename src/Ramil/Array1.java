package Ramil;

import java.util.ArrayList;

public class Array1 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5,6,7};
        //ArrayList
             //   [4, 5, 6, 7, 1, 2, 3]

        ArrayList<Integer> list = new ArrayList<>();
        for (int each1:nums) {
            if (each1>3){
                list.add(each1);
            }
        }
        System.out.println(list);

        for (int each2:nums) {
            if (each2<=3){
                list.add(each2);
            }
        }
        System.out.println(list);

    }
}
