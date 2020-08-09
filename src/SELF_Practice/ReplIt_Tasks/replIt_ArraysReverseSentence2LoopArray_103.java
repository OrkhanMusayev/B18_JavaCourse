package SELF_Practice.ReplIt_Tasks;

import java.util.Scanner;

public class replIt_ArraysReverseSentence2LoopArray_103 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here
        String[] words = sentence.split(" ");


        for(int i = words.length-1; i >= 0 ; i--){
            String eachWords = words[i];
            // System.out.print(eachWords+" ");
            reversed += eachWords+" ";

        }reversed=reversed.trim();



        //End your code here. do not modify below statement
        System.out.println(reversed);

    }
}
