package SELF_Practice.ReplIt_Tasks;

import java.util.Scanner;

public class replIt_ShoppingList_030 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();
        double totalPrice1 = count1 * price1;

        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();
        double totalPrice2 = count2 * price2;

        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();
        double totalPrice3 = count3 * price3;

        String report = "";
        double totalPrice;
        if (count1 <= 0) {
            report = ("Item2: " + item2 + " Price: " + totalPrice2 + ", Item3: " + item3 + " Price: " + totalPrice3);
            totalPrice = totalPrice2 + totalPrice3;
        } else if (count2 <= 0) {
            report = ("Item1: " + item1 + " Price: " + totalPrice1 + ", Item3: " + item3 + " Price: " + totalPrice3);
            totalPrice = totalPrice1 + totalPrice3;
        } else if (count3 <= 0) {
            report = ("Item1: " + item1 + " Price: " + totalPrice1 + ", Item2: " + item2 + " Price: " + totalPrice2);
            totalPrice = totalPrice2 + totalPrice1;
        } else {
            report = ("Item1: " + item1 + " Price: " + totalPrice1 + ", Item2: " + item2 + " Price: " + totalPrice2 + " Item3: " + item3 + " Price: " + totalPrice3);
            totalPrice = totalPrice1 + totalPrice2 + totalPrice3;
        }

        System.out.println(report);
        System.out.println("Total price: " + totalPrice);

    }
}
