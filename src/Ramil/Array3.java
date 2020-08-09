package Ramil;

import java.util.Arrays;

public class Array3 {

    public static void main(String[] args) {
        int a[] = {1, 2, 3}; //  output [1, 2, 3, 4, 5, 6]
        int b[] = {4, 5, 6};

        int [] ab = new int [a.length+b.length];
        int count=0;
        for (int each:a){
            ab[count] = each;
            count++;
        }

        for (int each1:b){
            ab[count]=each1;
            count++;
        }

        System.out.println(Arrays.toString(ab));
    }
}