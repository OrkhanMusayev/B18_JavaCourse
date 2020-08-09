package OficceHours.Practice_04_15_2020;

import java.util.Arrays;

public class StringMethods {
    /*
    String methods :
            toCharArray(): returns char array
            split(str): splits the string by given str, return string
     */

    public static void main(String[] args) {

        String str = "Cybertek";
        char[] ch = str.toCharArray(); // ['C','y','b','e','r','t','e','k']

        System.out.println(str.length() == ch.length); //  true

        /*
        str1 = "abc", str2 = "cab"
        ['a','b','c']
        ['c'.'a','b']

        ['a','b','c']
        ['a'.'b','c']
         */

        String str1 = "ABC";
        String str2 = "BAC";

        char[] ch1 = str1.toCharArray();//['a','b','c']
        char[] ch2 = str2.toCharArray();//['c'.'a','b']

        Arrays.sort(ch1); //  ['a','b','c']
        Arrays.sort(ch2); //  ['a','b','c']

        System.out.println(Arrays.equals(ch1,ch2));

        System.out.println("=================================================");

        String sentence = "I like to learn Java";

        String[] word = sentence.split(" "); // [I, like, to, learn, Java]
        System.out.println(Arrays.toString(word));

        int totalWords = word.length;
        System.out.println(totalWords);

        String result = "";

        //[I, like, to, learn, Java]
        for(int i = word.length-1; i>=0 ;i--){
            //System.out.print(word[i] +" ");
            result += word[i] +" ";
        }
        System.out.println(result.trim()); // we use trim to remove space from end of output

        // java learn to like I



















    }
}
