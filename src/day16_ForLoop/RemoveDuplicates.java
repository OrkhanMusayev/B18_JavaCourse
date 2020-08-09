package day16_ForLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "AAAABBBBBCCCCDDDDDAAABBBBBCCC";


        String result = "";  // "CD"

        for(int i=0; i <= str.length()-1 ; i++){  // 0 , 1, 2 ,3
            /*
            if( !result.contains( ""+str.charAt(i)) ) {
                result += str.charAt(i);
            }
             */

            if(result.contains( ""+str.charAt(i) )){ // i is the index number
                // if the string result does not contains str.charAt(i),
                // then we concat it to the result,
                // if it does we will not concat it to the result
                continue;
            }

            result += str.charAt(i); // only gets executed if str.charAt(i) is not contained in the result


        }

        System.out.println(result);










    }
}
