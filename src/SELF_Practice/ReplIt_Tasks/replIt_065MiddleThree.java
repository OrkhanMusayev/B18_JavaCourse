package SELF_Practice.ReplIt_Tasks;

import java.util.Scanner;

/**
You have a word, do the following:

If the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.

Otherwise print "invalid".

fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid
whatsup ==> ats
$ ==> invalid
 */

public class replIt_065MiddleThree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        int lenght = word.length();
        String middleThree =" ";
                                           // 1234567
        if(lenght >= 5 && lenght % 2 !=0){ // whatsup == >>
                                           // 0123456
            middleThree += word.substring(lenght / 2 - 1, lenght /2 + 2);
            System.out.println(middleThree.trim());
        }else{
            System.out.println("Invalid");
        }



    }

}
