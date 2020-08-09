package SELF_Practice.Loop;

import java.util.Scanner;

/**
 * String str =“AAAaaaBBBbbb”
 */
public class test {

    public static void main(String[] args) {
/*
       // String str =“AABBBCCCDDD => A2B3C3D3E

        String str = "AABBBCCCDDDE";

        String result = "";


        for(int i = 0; i <= str.length()-1; i++){

            int count = 0;

            for(int j =0; j <=str.length()-1; j++){

                if(str.charAt(i) == str.charAt(j)){
                    count ++ ;
                }
            }


            if( count >= 1 && !result.contains(""+str.charAt(i))){
                result += str.charAt(i) + ""+count;
            }
        }

        System.out.println(result);

 */




/*
        String str ="AAAaaaBBBbbb";
        String upperCase ="";
        String lowerCase="";

        for(int i = 0; i <= str.length()-1; i++){
           char ch = str.charAt(i);
           if(ch >= 'A' && ch <= 'Z'){
               upperCase += ch;
           }else{
               lowerCase += ch;
           }
        }

        System.out.println("Upper case :"upperCase);
        System.out.println(lowerCase);

 */
/*

// find uniques => CD

        String str ="AAABBBCDEEE";

        String unique = "";


        for(int j=0; j <= str.length()-1; j++ ){
            char ch2 = str.charAt(j);
            int count = 0 ;  // to count the occurrence of the character

            for(int i = 0; i <= str.length()-1; i++){
                char ch = str.charAt(i);
                if(ch == ch2){  // check how many time the character is  occurred in the string
                    count++;
                }
            }

            if(count == 1){
                unique+=ch2;
            }
        }
        System.out.println(unique);

 */

        //Stirng str = AABCCDEE   result ==> AACCEE

        String str = "AABCCDEE";

        String result ="";

        for(int i = 0;i < str.length();i++){
            if(!result.contains(""+str.charAt(i))){
                result += ""+str.charAt(i);
            }
        }

        System.out.println(result);








    }
}
