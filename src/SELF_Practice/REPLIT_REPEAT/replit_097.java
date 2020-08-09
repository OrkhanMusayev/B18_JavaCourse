package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
 * Example:
 * input: We study java not python
 * output: true
 *
 * Example:
 * input: What's the difference between java, javascript and python?
 * output: false
 */
public class replit_097 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();//We study java not python ==>true

        int countJava = 0;
        int countPython = 0;

        String[] words = sentence.split(" ");
        for (String each : words) {
            if (each.contains("java")) {
                countJava++;
            }
            if (each.contains("python")){
                countPython++;
            }

        }

        System.out.println(countJava==countPython);
    }
}