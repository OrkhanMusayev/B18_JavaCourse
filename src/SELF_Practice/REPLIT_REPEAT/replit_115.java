package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length
 *
 * Example:
 * words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
 * prints jaaaaavvaaaaaaaaaa
 */
public class replit_115 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {

            words[i] = input.nextLine();

            String result = "";


            for(String eachWord :words){
                if(eachWord.length() > result.length()){
                    result=eachWord;
                }

            }
            System.out.println(result);

        }
    }
    }
