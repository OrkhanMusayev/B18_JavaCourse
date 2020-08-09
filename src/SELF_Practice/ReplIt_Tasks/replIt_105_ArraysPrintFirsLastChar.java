package SELF_Practice.ReplIt_Tasks;

import java.util.Arrays;
import java.util.Scanner;

/**
Given a String array words, iterate through each word and print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]
 */

public class replIt_105_ArraysPrintFirsLastChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for(int i = 0; i<words.length; i++){
            //words[i] = words[i].substring(0,1)+words[i].substring(words[i].length()-1);
            words[i] = words[i].substring(0,1).concat(words[i].substring(words[i].length()-1));

        }
        System.out.println(Arrays.toString(words));
















    }
}
