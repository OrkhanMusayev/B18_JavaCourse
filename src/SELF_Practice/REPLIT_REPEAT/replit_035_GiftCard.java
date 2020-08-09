package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase. If item is not in the list, display message: "Invalid item!". If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
Hint
Use if/ else if / else
CODE EXAMPLE:
Example #1
input: Hat
output: Thank you for your purchase!
output: Your current balance is: 75$

Example #2
input: Pants
output: Thank you for your purchase!
output: Your current balance is: 50$

Example #3
input: Laptop
output: Sorry, not enough funds on your gift card!

Example #4
input: Cupcake
output: Invalid item!
List of items
 */

public class replit_035_GiftCard {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        //WRITE YOUR CODE HERE

        int giftCard = 100;

        if(item.equals("Smartphone")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(item.equals("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(item.equals("Charger")){
            int currentBalance = giftCard - 15;
            System.out.println("Thank you for your purchase!"+"\nYour current balance is :"+currentBalance);
        }else if(item.equals("USB cable")){
            int currentBalance = giftCard - 10;
            System.out.println("Thank you for your purchase!"+"\nYour current balance is :"+currentBalance);
        }else if(item.equals("Headphones")){
            int currentBalance = giftCard - 30;
            System.out.println("Thank you for your purchase!"+"\nYour current balance is :"+currentBalance);
        }else if(item.equals("Pants")){
            int currentBalance = giftCard - 50;
            System.out.println("Thank you for your purchase!"+"\nYour current balance is :"+currentBalance);
        }else if (item.equals("Hat")){
            int currentBalance = giftCard - 25;
            System.out.println("Thank you for your purchase!"+"\nYour current balance is :"+currentBalance);
        }else if(item.equals("Socks")){
            int currentBalance = giftCard - 5;
            System.out.println("Thank you for your purchase!"+"\nYour current balance is :"+currentBalance);
        }else if(item.equals("Blanket")){
            int currentBalance = giftCard - 60;
            System.out.println("Thank you for your purchase!"+"\nYour current balance is :"+currentBalance);
        }else if(item.equals("Pillow")){
            int currentBalance = giftCard - 40;
            System.out.println("Thank you for your purchase!"+"\nYour current balance is :"+currentBalance);
        }else{
            System.out.println("Invalid item!");
        }


    }
}
