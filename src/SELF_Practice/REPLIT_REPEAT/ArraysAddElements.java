package SELF_Practice.REPLIT_REPEAT;

/**
 * Method addElements accepts 2 int arrays and adds each element value of two arrays and returns a new array. You can assume that each array has 5 elements
 *
 * addElements(new int[][10, 40, 50, 3, 1],
 *             new int[][11, 0, 500, 44, 1101]);
 * --------
 * return array after adding values in the arrays:
 *              [21, 40, 550, 47, 1102]
 */
public class ArraysAddElements {

    public static int[] addElements(int[] ints1, int[] ints2) {

        // inst1 {1,4,6,9,7}
        // inst2 {2,3,5,8,4}
        // array {0,0,0,0,0}
        int array[] = new int[ints1.length];

        for(int i=0; i < array.length; i++){
            array[i] = ints1[i] + ints2[i];

        }

        return array;

    }

}
