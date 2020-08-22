package Kudrat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class checkLength_dontUseLengthMethod {
public static void main(String args[]) throws Exception {
    String str ="java";
    int num =0;
    char [] ch = str.toCharArray();
    //num = ch.length; // First way

    for (char c : str.toCharArray()){
        // num++;       // Second way
    }

    List<String> d = new ArrayList<>(Arrays.asList(str.split("")));
    //num = d.size();  // Third way

    for (char i =0; i < str.toCharArray().length; i++){
        num ++;   // Fourth way
    }

    System.out.println(num);

}


}


