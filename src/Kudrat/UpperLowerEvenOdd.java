package Kudrat;

/**
 * String upper ="";      // all upper case letters
 * String lower ="";     // all lower case letters
 * String even ="";      // all even numbers
 * String odd ="";      // all odd numbers
 * char [] ch ={'a','B','D','T','w','C','6','8','2','t','K','C','o','O','f','F','1','2','3','9'};
 */
public class UpperLowerEvenOdd {
    public static void main(String[] args) {

        String upper = "";      // all upper case letters
        String lower = "";     // all lower case letters
        String even = "";      // all even numbers
        String odd = "";      // all odd numbers
        char[] ch = {'a', 'B', 'D', 'T', 'w', 'C', '6', '8', '2', 't', 'K', 'C', 'o', 'O', 'f', 'F', '1', '2', '3', '9'};

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                upper += ch[i]; // upper case
            }
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                lower += ch[i]; // lower case
            }
            if (Character.isDigit(ch[i])) {
                int temp = Integer.parseInt(""+ch[i]);
                if (temp%2==0){
                    even+=ch[i];
                }else{
                    odd+=ch[i];
                }
            }


        }
            System.out.println("Upper case: "+upper);
            System.out.println("Lower case: "+lower);
            System.out.println("Even case: "+even);
            System.out.println("Odd case: "+odd);



    }
}