package SELF_Practice.ReplIt_Tasks;

import java.util.Scanner;

public class replIt_Coffeine_033 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int caffeineInDrink= input.nextInt();
        int drinksToKill = 10*1000/caffeineInDrink;

        System.out.println("It would take about " + drinksToKill+" drinks for a lethal overdose.");


    }
}
