package AzeCybertek;

import java.util.Arrays;

public class anar2 {

    public static void ZerosToEnd(int arr[], int n){
        int count = 0;

        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];

        while (count < n)
            arr[count++] = 0;
    }
    public static void main (String[] args){

        int arr[] = { 0,1,0,3,6,7,8,0,13,16,0 };  //--> [1, 3, 6, 7, 8, 13, 16, 0, 0, 0, 0]
        int n = arr.length;
        ZerosToEnd( arr, n );
        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i<n; i++)
//            System.out.print( arr[i]+" " );
    }
}
