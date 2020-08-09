package SELF_Practice.ReplIt_Tasks;

import java.util.Scanner;

public class replIt_VerifyContains_060 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE

        boolean wordInTheSentence = sentence.contains(word);
        System.out.println(wordInTheSentence);


    }
}