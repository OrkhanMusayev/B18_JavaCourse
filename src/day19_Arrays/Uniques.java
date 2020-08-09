package day19_Arrays;
/**
1. write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
 */

import java.util.Scanner;

public class Uniques {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = input.next();

        String result = ""; // unique character will be concated to this result
        // in order to find which is unique, we need to compare it to each index so we can use loop for repeating compare


        for(int j=0; j <= str.length()-1; j++ ){
            // this outer loop up will repeat as many times as there are characters in a string.
            // str.length()-1 represents the last index of any string
            // we start this loop and put the following steps inside it to repeat it for each character
            // the following steps are the steps needed for each character of the string to compare with the other characters
            char ch2 = str.charAt(j);
            int count = 0 ;  // the purpose of this variable is to count the occurrence of the character

            for(int i = 0; i <= str.length()-1; i++){
                char ch = str.charAt(i); // we use charAt() to get the char at that index from String
                if(ch == ch2){  // check how many time the character is  occurred in the string
                    count++;
                }
            }

            if(count == 1){  // the the character at index J is unique , will be concated to thre sult
                result+=ch2;
            }

        }


        System.out.println(result);


        System.out.println("===========================================================================================");


        // now we will try it with char


        String  str2 = "ababacv"; // cv are unique
        String result2 = ""; // to store unique characters

        //this outer loop will repeat the steps of checking wether unique for how many characters we have
        for (int y = 0; y <= str2.length()-1;  y++){// now y is the index number
            // if y is the index number we can retrieve each character by using charAt() method to replace the index#
            char ch2 = str2.charAt(y);
            // these following steps need to be repeated for each character of the string as many characters we have
            int  count2 = 0; // to count how many times each character is occurred in the string

            for (int z = 0; z <=str2.length()-1; z++){
                char ch = str2.charAt(z);
                if (ch == ch2){
                    count2 ++;
                }
            }
            if (count2 == 1){
                result2 += ch2;
            }
        }

        System.out.println(result2);        // cv

    }

}