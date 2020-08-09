package Codingbat;

import java.util.Collections;

public class test {

    public static void main(String[] args) {

        String name = "Aze Cybertek";
        String result="";
        int last = name.length()-1;

        for(int i=last;i>=0;i--){
            result+=""+name.charAt(i);
        }

        System.out.println(result);


    }
}