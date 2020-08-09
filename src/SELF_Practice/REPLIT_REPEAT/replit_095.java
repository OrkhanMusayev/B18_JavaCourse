package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.
 *
 * Example:
 * input: breadjambread
 * output: jam
 *
 * Example:
 * input: xxbreadjambreadyy
 * output: jam
 *
 * Example:
 * input: xxbreadapple
 * output: nothing
 *
 * Example:
 * input: breadbutterbread
 * output: butter
 */
public class replit_095 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next(); // breadjambread

        // String contains bread
        // first make sure we have at least 2 bread
        // then get the middle part using substring

        if(str.contains("bread")){
            int firstIndex = str.indexOf("bread");
            int lastIndex = str.lastIndexOf("bread");
            if(firstIndex==lastIndex){
                System.out.println("nothing");
            }else{
                // it means we have at least 2 bread
                // 0123456789...
                // breadjambread
                System.out.println(str.substring(firstIndex+5,lastIndex));
            }
        }else{
            System.out.println("nothing");
        }


    }
}
