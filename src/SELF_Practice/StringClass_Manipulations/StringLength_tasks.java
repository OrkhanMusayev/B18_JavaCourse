package SELF_Practice.StringClass_Manipulations;

import java.util.Scanner;

public class StringLength_tasks {

    public static void main(String[] args) {

        String name = "Donald J Trump";
        System.out.println(name.length());


        String name1 = "Orkhan Musayev Ramazanovich";
        int Length = name1.length();
        System.out.println(Length);

        System.out.println("===================================");



        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String enterName = input.next();
        System.out.println(enterName.length());





    }
}
