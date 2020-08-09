package SELF_Practice.Loop;

 /*
    write a program that can ask the user to "enter a word"
    five times and returns the word that has the maximum length
     */


import java.util.Scanner;

public class For_Loom_Tasks_04_04_2020 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String result = "";
        for (int i =0; i <5; i++){
            System.out.println("Enter a word");
            String count = input.nextLine();
            if(count.length()>result.length()){
                result = count;
            }
        }
        System.out.println("The longest word is: "+ result);

    }

    }
