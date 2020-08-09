package Kudrat;

import java.util.Scanner;

public class NonDuplicates {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String str = scan.next();

        String nonDup="";

        for(int i=0;i<=str.length()-1;i++){
            if(!nonDup.contains(""+str.charAt(i))){
                nonDup+=str.charAt(i);
            }
        }

        System.out.println(nonDup);


    }
}
