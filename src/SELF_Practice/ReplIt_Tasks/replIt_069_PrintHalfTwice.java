package SELF_Practice.ReplIt_Tasks;

import java.util.Scanner;

/**
Write a program that will print out first half of the word twice.

Example:

input: java
output: jaja
 */

public class replIt_069_PrintHalfTwice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        if(word.length()%2!=0){
            word=word.substring(0,word.length()/2)+word.substring(0,word.length()/2);
        }else{
            word=word.substring(0,word.length()/2)+word.substring(0,word.length()/2);
        }
        System.out.println(word);



    }
}
