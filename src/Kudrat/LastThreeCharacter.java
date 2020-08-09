package Kudrat;

public class LastThreeCharacter {

    public static void main(String[] args) {

        // 12
        String str= "AAABBBCCCDEF"; //  ==>  "DEF
        // 11
        String result=str.substring(9,10)+str.substring(10,11)+str.substring(11,12);

        System.out.println(result);

    }
}
