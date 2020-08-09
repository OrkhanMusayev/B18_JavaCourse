package AzeCybertek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List {

    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,4,2,5,8,6,3,1,8,7));
        Integer maxNum = Collections.max(list);
        list.removeAll( Arrays.asList(maxNum) );
        int secMax= Collections.max(list) ;

        System.out.println(secMax);
    }

}
