package Kudrat;

import java.util.Arrays;
import java.util.Collections;

public class DEF {

    public static void main(String args[]) {

        String h="AAABBBCCCDEF"; // ==>DEF
        String s="";
        for(int i=0;i<h.length();i++){
            int count= Collections.frequency(Arrays.asList(h.split("")),""+h.charAt(i));
            if(count==1){
                s+=h.charAt(i);
            }
        }
        System.out.println(s);

    }
}
