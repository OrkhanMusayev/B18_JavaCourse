package WarmpUpTasks.Night_WarmUp;

import java.util.function.DoubleToIntFunction;

/**
1.  write a return method that accepts a String and removes duplicate values from the String
        Ex:
                RemoveDuplicate("aaabbbccc");  ==> "abc"
    2. write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
        Ex:
            Frequency("AAABB", "A");  ==> 3
            Frequency("ABAB", "B"); ==> 2
    3. (This one I will do it too tomorrow in class) Combine above two methods to write a return method that can return the frequency of characters as a string from any given string
        Ex:
            FrequencyOfChars("ABABCB"); ==> "A2B3C1";
            FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"
 */

public class TaskSolution_04_19_2020 {

    public static void main(String[] args) {

        System.out.println("Duplicates Removed: "+RemoveDuplicate("aaabbbccc"));
        System.out.println("Frequency is: "+ Frequency("AAABB", "A"));
        System.out.println("Frequency is: "+ Frequency("ABAB", "B"));




    }

    public static String RemoveDuplicate(String str){
        String RemoveDuplicates = "";
        for(int i=0; i < str.length(); i++){
            if(!RemoveDuplicates.contains(str.substring(i,i+1))){
                RemoveDuplicates += str.substring(i, i+1);
            }
        }
        return RemoveDuplicates;
    }

    public static int Frequency(String str1, String str2){
        int count=0;
        for(int i =0; i < str1.length(); i++){
            if(str1.substring(i,i+1).equalsIgnoreCase(str2)){
                count++;
            }
        }
        return count;
    }
    


}
