package WarmpUpTasks.REPEATALLWARMUPS;

import java.util.Scanner;

/**
write a program to identify if a string is palindrome or not. if yes==> true,.otherwise ==> false
        level ==> level ==> palindrome
 */
public class Palindrome1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word, I will check is it palindrome or not palindrome");
        String word = scan.next(); // anna ==>> anna this name is palindrome

        String reverse ="";

        for(int i = word.length()-1; i >= 0; i--){
            reverse += word.charAt(i);
        }


        System.out.println(reverse);






    }
}
