package Kudrat;

import java.util.Arrays;

public class ReturnAllNumFromArrays {
    public static void main(String[] args) {
        int arr [] ={15,25,10,20};
        int sum=0;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);


        char[] ch = {'a','b','c'};
        String sumchar="";
        for (int x=0; x<ch.length; x++){
            sumchar+=ch[x];
        }
        System.out.println(sumchar);
    }
}
