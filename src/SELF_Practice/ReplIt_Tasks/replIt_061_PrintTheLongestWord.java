package SELF_Practice.ReplIt_Tasks;

import java.util.Scanner;

public class replIt_061_PrintTheLongestWord {
    public static void main(String[] args) {

        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WRITE YOUR CODE HERE

        if(word1.length()>word2.length()){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }








    }
}
