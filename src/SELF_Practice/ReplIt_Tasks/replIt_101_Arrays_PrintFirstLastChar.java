package SELF_Practice.ReplIt_Tasks;
/**
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne

 */
import java.util.Scanner;

public class replIt_101_Arrays_PrintFirstLastChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below

        for(int i=0; i<words.length; i++){
            words[i] = " "+ words[i].charAt(0)+words[i].charAt(words[i].length()-1);
            words[i] =words[i].trim();
            System.out.println(words[i]);
        }


    }
}

