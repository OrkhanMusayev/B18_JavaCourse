package day21_MultiDimensionalArrays;
/*
	1. write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
 */
public class Average_Number {

    public static void main (String [] args){

        int [] arr = {10,20,30,40,50}; // 5,10 // you can also convert to double
        // average: sum of all numbers / length

        int length = arr.length; // total number of the elements,  you can also convert to double
        int sum = 0; //  you can also convert to double

        for(int i = 0; i< length; i++){
            int eachNum = arr[i]; //  you can also convert to double
            sum += eachNum;
        }

        double average = sum/length;

        System.out.println(sum);
        System.out.println(sum/length);
        System.out.println(average);



         /*
                [2,1,3] ==> 6
                [1,2,3] ==> 6
         */

/*
        int[] arr2 = {1,2,2}; // 5/3 =
        System.out.println( 5/3 );
        System.out.println( 5/(double)3);
*/



    }
}
