package day33_CustomClass;

import java.util.ArrayList;

/**
write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
            ex:
                str = "ABCD123$%#@&456EFG!";
                list1: {$, %, #, @, &, !}
                list2: {A, B, C, D, E, F, G}
                list3: {1, 2, 3, 4, 5, 6}
        DO NOT USE LAMBDA

 */

public class ExtractChars {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        char[] arr = str.toCharArray();

        ArrayList<Character> letters = new ArrayList<>(); // isLetter();
        ArrayList<Character> digits = new ArrayList<>(); // is Digits
        ArrayList<Character> specialChars = new ArrayList<>();

        for(Character each: arr){
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
