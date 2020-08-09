package SELF_Practice.ReplIt_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class replIt_ArraysSplitSentenceLoopString_106 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] word = sentence.split(" ");

        for(int i = 0 ; i <= word.length-1 ; i++){
            System.out.println(word[i]);
        }





    }
}
