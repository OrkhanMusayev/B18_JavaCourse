package day52_Collection;

import java.util.Arrays;
import java.util.TreeSet;

public class task {

    public static void main(String[] args) {

        String str = "AAABBCCCCGGHHEEYY"; // ABCGHEY
        String result="";
        for (int i=0;i<str.length();i++){
            if(!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }

        System.out.println(result);

        System.out.println("========================================");

        String str1 = "AABBCCDDJJLLVV"; // A, B, C, D, J, L, V
        String[] arr = str1.split("");
        TreeSet<String> nonDups = new TreeSet<>(Arrays.asList(arr));
        System.out.println(nonDups);
    }
}
