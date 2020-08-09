package SELF_Practice.REPLIT_REPEAT;

import java.util.ArrayList;
import java.util.Arrays;

/**
 extractNum

 description:
 a method that cleans any non number string from a string it gets
 and returns the clean string
 input:
 -s (string)- a string the method gets
 return: string: a string of numbers only

 example use:

 extractNum("aa2aa3") ==> 23

 extractNum("aa2") ==> 2

 extractNum("aa10aa") ==> 10

 extractNum("aa!!%$#.10aa") ==> 10


 hint:
 you can use:
 Character.isDigit(ch)
 or Conditions (on ascii table, the characters between #48 ~ #57 are digits)



 */

public class replit_MethodsWithString12ExtractNumberFromString {


//        String word = "a!a!%$#.10aa";
//
//        String result = "";
//
//      for(int i=0; i < word.length(); i++){
//          if(word.charAt(i)>=48 && word.charAt(i)<=57){
//             // result += word.charAt(i);
//          }
//      }
//
//        System.out.println(result);
//
//        System.out.println("=====================================================");
//
//
//        for(int i=0; i < word.length(); i++){
//            if(Character.isDigit(word.charAt(i))){
//                result += word.charAt(i)+"";
//            }
//        }
//        System.out.println(result);
//
//
//    }
//

    public static String extractNum(String s) {

        String result = "";
        for(int i=0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                result += s.charAt(i);
            }
        }
        return result;

    }


    public static void main(String[] args) {

        String word = "a!a!%$#.10aa";
        String result = extractNum(word);
        System.out.println(result);

        String result2 = extractNum("abb12345trbskksnc");
        System.out.println(result2);


        System.out.println(extractNum("ofnd54v6vvvc64d6v"));


        ArrayList<Character> list = new ArrayList<>();
        String result3="";
        list.addAll(Arrays.asList('a','b','c','1','2'));
        for(int i=0; i<list.size(); i++){
            if(Character.isDigit(list.get(i))){
                result3+=list.get(i);
            }
        }
        System.out.println(result3);



        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList("jjj33","j98h","ab1dd5"));
        String str5 ="";
        for (int i =0; i < list1.size(); i++){
            str5 += list1.get(i);
        }
        System.out.println(str5);

        String str7 ="";
        for (int i=0; i< str5.length(); i++){
            if (Character.isDigit(str5.charAt(i))){
                str7 += str5.charAt(i);
            }
        }
        System.out.println(str7);

    }
}


