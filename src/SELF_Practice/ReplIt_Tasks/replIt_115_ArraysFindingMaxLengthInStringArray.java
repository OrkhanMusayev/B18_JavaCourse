package SELF_Practice.ReplIt_Tasks;
/**
Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */
import java.util.Scanner;

public class replIt_115_ArraysFindingMaxLengthInStringArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {

            words[i] = input.nextLine();
        }
/**
1st way:
        String result = "";
        for(String eachWord :words){
            if(eachWord.length() > result.length()){
                result=eachWord;
            }

        }
        System.out.println(result);

 */

// 2nd way:

        String result = "";
        for(int i = 0; i < words.length; i++ ){
            if(words[i].length() > result.length()){
                result=words[i];
            }
        }

        System.out.println(result);





    }
}