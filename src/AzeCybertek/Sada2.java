package AzeCybertek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sada2 {

    public static void main(String[] args) {

        int arr[]={1,0,4,0,5,0,7,0};  //==> [1, 4, 5, 7, 0, 0, 0, 0]

        ArrayList<Integer> list = new ArrayList<>();

        int count=0;
        for (int i=0;i<arr.length;i++){
            list.add(arr[i]);
            count= Collections.frequency(list,0);

        }

        list.removeAll(Arrays.asList(0));

        int a [] = new int [arr.length];

        for (int k=0;k<arr.length-count;k++){
            a[k]=list.get(k);
        }

        System.out.println(Arrays.toString(a));




    }
}
