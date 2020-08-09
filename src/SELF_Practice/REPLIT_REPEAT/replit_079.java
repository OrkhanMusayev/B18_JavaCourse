package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * In this exercise you get a string called txt .
 *
 * output txt without its last letter.
 *
 * for example:
 *
 * txt = "foo"
 *
 * output will be:
 * fo
 */
public class replit_079 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here


        txt = txt.substring(0, txt.length() - 1);
        System.out.println(txt);

    }
}

