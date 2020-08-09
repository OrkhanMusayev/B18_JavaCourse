package Kudrat;

/**
 * write a java program to find sum of digits in the given string;
 * String a="4254437576";
 */
public class FindSumString {

    public static void main(String[] args) {

        String a ="4254437576";
        int sum=0;


        for (int i=0; i<a.length();i++){
            if(Character.isDigit(a.charAt(i))){
                sum += Integer.parseInt(""+a.charAt(i));
            }
        }

        System.out.println(sum);
    }
}
