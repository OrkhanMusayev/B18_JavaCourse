package day10_Switch_Scanner;

import java.util.Scanner;

public class ReadingUserInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type some data for the program: ");
        String input = scanner.nextLine();
        System.out.println("input =" + input);
    }
}
