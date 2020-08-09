package day33_CustomClass;

/**
 write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
 ex:
 str = "ABCD123$%#@&456EFG!";
 list1: {$, %, #, @, &, !}
 list2: {A, B, C, D, E, F, G}
 list3: {1, 2, 3, 4, 5, 6}
 DO NOT USE LAMBDA

 */

import java.util.ArrayList;

public interface ExtractChars2 {

    public static void main(String[] args) {


        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> letters = new ArrayList<>(); // isLetter();
        ArrayList<Character> digits = new ArrayList<>(); // is Digits
        ArrayList<Character> specialChars = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            char each = str.charAt(i);

            if(Character.isLetter(each)){ // if each elements is letters
                letters.add(each);
            } else if(Character.isDigit(each)){ // if given character is digit or not
                digits.add(each);
            }else{
                specialChars.add(each);// if it is not letters or digits then print me specialChars
            }
        }

        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);
    }
}
