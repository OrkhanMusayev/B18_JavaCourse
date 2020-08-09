package AzeCybertek;

import java.util.Arrays;

public class sumZero {

    public static void main(String[] args) {

        int[] arr = {1, 0, 3, 4, 5, 6, -1, -4};
        Arrays.sort(arr);
        //-4, -1, 0, 13, 4, 5, 6

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == 0) {
                    System.out.println(arr[i]+""+arr[j]+"");


                }
            }
        }

//        int [] arr = {7,8,10};//expected result: 3
//
//        int actualSize = arr.length+1;
//        int total = actualSize*(actualSize+1)/2;
//        int sum=0;
//        for(int i=0; i<arr.length;i++){
//            sum+=arr[i];
//        }
//        System.out.println(total-sum);

    }
}
