package InterviewCodingTasks;

import java.util.Arrays;

/**
 * Write a return method that check if a string is build out of the same letters as another string.
 *
 * Ex:  same("abc",  "cab"); -> true
 *
 * same("abc",  "abb"); -> false:
 */
public class SameLetter {

    public static boolean same(String x, String y){

        char[] ch1 = x.toCharArray();
        char[] ch2 = y.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String str1 = "";
        String str2 = "";

        for(char each:ch1){
            str1 += each;
        }

        for(char each:ch2){
            str2 += each;
        }

        return str1.equals(str2);
    }

    public static void main(String[] args) {
/*
        String[] arr1 = {"abc","cab"};
        String[] arr2 = {"abc","abb"};

 */

        System.out.println(same("abc","cab"));
       // System.out.println(same("abc","abb"));

    }
}
