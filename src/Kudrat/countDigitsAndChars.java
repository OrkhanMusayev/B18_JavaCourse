package Kudrat;

public class     countDigitsAndChars {

    public static void main(String[] args) {
        String str ="A3B5C11ETU8";

        /*
        /**
 * String str = “A3B5C11ETU8” == find how many digits and how many Characters you have
 * hint you need 2 variables one for counting digits one for count character
 * find the sum of all numbers = sum should be 18
 * it can be done with one loop
 * your another variable for sum
 * create 2 more String variable for assigning digits and chars
 */

        System.out.println(countDigitsAndChars(str));
        System.out.println(sumOfAll(str));


        String st2 ="12345";
        int num = Integer.parseInt(st2);
        System.out.println(num);
        String str3 =String.valueOf(num);
        System.out.println("Im string "+str3);

    }

    public static String countDigitsAndChars(String str){
        int countDigit=0;
        int countChar =0;

        for (int i =0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                countDigit++;
            }
            if (Character.isLetter(str.charAt(i))){
                countChar++;
            }
        }
        String digits =""+countDigit;
        String chars = ""+countChar;



        return "Digits "+ digits+"\nChars "+ chars;

    }

    public static int sumOfAll(String str){
        int sum =0;

        for (int i=0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt(""+str.charAt(i));
            }
        }
        return  sum;
    }
}
