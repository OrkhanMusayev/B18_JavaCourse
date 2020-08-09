package SELF_Practice.ReplIt_Tasks;
/*
Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
such as with "javaxxx" or "xjavaxx" but not "xxjavaxx".
The string may be any length, including 0word = .


 */
import java.util.Scanner;

public class replIt_HasAJava_Loop_087 {

        public static void main(String[] args) {
            boolean exists = false;
            Scanner scan = new Scanner(System.in);
            String word = scan.next();

            if (word.length() < 4){
                System.out.println(false);
            } else if (word.length() >=4 && word.startsWith("java") ||  word.substring(1).startsWith("java") ){
                System.out.println(true);
            } else {
                System.out.println(false);
            }

    }
}
