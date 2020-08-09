package day14_StringClass;

import java.util.Scanner;

public class ClassTasks {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        String fullName = firstName+" "+lastName;
        System.out.println("Your full name has: "+(fullName.length()-1)+" character");



    }
}
