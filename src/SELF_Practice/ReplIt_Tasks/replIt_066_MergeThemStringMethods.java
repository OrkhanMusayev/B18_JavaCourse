package SELF_Practice.ReplIt_Tasks;

import java.util.Scanner;

/**
You have 2 words, both of them have 3 characters.
If either of them does not have exactly 3 characters, print "cannot merge"
Merge their characters one by one and print together like below:

aok
lol
alookl

ear
pie
epaire

java
wow
cannot merge

 */

public class replIt_066_MergeThemStringMethods {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

        int length1 = word1.length();
        int length2 = word2.length();

        String result="";

        if(length1 >3 || length2 >3){
            result = "cannot merge";
        }else{ // example : aok and lol ==> alookl
            result = word1.charAt(0) + "" + word2.charAt(0) + word1.charAt(1) + word2.charAt(1) + word1.charAt(2) + word2.charAt(2);
        }
        System.out.println(result);









    }
}
