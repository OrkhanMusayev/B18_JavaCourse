package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.
 *
 * Example:
 * sentence -> "Java is fun"
 * reversed -> "fun is Java"
 */
public class replit_103 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String reversed = "";

        String[] words = sentence.split(" ");

        for(int i = words.length-1; i >= 0 ; i--){
            String eachWords = words[i];
            // System.out.print(eachWords+" ");
            reversed += eachWords+" ";

        }

        System.out.println(reversed);


    }
}
