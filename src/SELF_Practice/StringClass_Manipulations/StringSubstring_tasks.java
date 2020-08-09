package SELF_Practice.StringClass_Manipulations;

public class StringSubstring_tasks {

        public static void main(String args[]) {
            String str= new String("quick brown fox jumps over the lazy dog");

            System.out.println("Substring starting from index 15:");
            System.out.println(str.substring(15));
            System.out.println("Substring starting from index 15 and ending at 20:");
            System.out.println(str.substring(15, 20));


            System.out.println("========================================================");

            String sentence ="I love Java programing language";
            System.out.println(sentence.substring(6));
            System.out.println(sentence.substring(6,11));


    }
}
