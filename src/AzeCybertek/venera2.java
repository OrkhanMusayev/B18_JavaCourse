package AzeCybertek;

/**
 * Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
 * maxTriple([1, 2, 3]) → 3
 * maxTriple([1, 5, 3]) → 5
 * maxTriple([5, 2, 3]) → 5
 */
public class venera2 {

    public int maxTriple(int[] nums) {
        int result = 0;
        int a = nums[0];
        int b= nums[((nums.length+1)/2) -1];
        int c = nums[nums.length -1];

        if (a>b && a>c)
        result = a;
        if (b>a && b>c)
        result = b;
        if (c>a && c>b)
        result = c;
        return result;

    }

    public static void main(String[] args) {

        int [] nums = {1, 7, 3, 1, 5}; // first 1, last 5 , middle 3
        int result = 0;
        int a = nums[0];
        int b= nums[((nums.length+1)/2) -1];
        int c = nums[nums.length -1];

        if (a>b && a>c)
            result = a;
        if (b>a && b>c)
            result = b;
        if (c>a && c>b)
            result = c;

        System.out.println(result);

    }

}
