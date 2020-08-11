package Edabit;

/**
 * Create a function that searches for the index of a given item in an array. If the item is present, it should return the index, otherwise, it should return -1.
 *
 * Examples
 * search([1, 2, 3, 4], 3) ➞ 2
 *
 * search([2, 4, 6, 8, 10], 8) ➞ 3
 *
 * search([1, 3, 5, 7, 9], 11) ➞ -1
 * Notes
 * If the item is not present, return -1.
 * The given array is ordered.
 */
public class findIndex {

    public static int search(int arr[], int item) {
        // search([1, 2, 3, 4], 3) ➞ 2
        // search([1, 3, 5, 7, 9], 11) ➞ -1

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == item){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        int item = 7;
        System.out.println("search() = " + search(arr,item));
    }

}
