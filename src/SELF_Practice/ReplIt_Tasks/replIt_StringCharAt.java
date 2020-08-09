package SELF_Practice.ReplIt_Tasks;

import java.util.Scanner;

public class replIt_StringCharAt {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here

        char ch1 = txt.charAt(5);
        char ch2 = txt.charAt(6);
        char ch3 = txt.charAt(6);

        System.out.print(ch1);
        System.out.print(ch2);
        System.out.print(ch3);

    }
}