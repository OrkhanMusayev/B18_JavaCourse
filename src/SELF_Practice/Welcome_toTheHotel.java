package SELF_Practice;

import java.util.Scanner;

public class Welcome_toTheHotel {
/*
 write a program for the room reservation:
        king bed==>120$
        queen bed==>100$
        single bed==>80$
        should ask which bedroom do you wanna reserve
          if you provided invalid entry => please re-enter
          calculate the total price
          do you want to reserve another room?
          if answer is yes ==> repeat the previous steps
          if answer is no ==> your total price is:$$$
         If the answer is not yes or no ==> re-enter

 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("||          WELCOME            ||");
        System.out.println("||       Добро Пожаловать      ||");
        System.out.println("||        Hoş geldiniz         ||");


        int totalPrice = 0;
        while (true){
            System.out.println("which bedroom do you want reserve?");
            String str = input.nextLine();
            while (!(str.equalsIgnoreCase("king bed")
                    ||str.equalsIgnoreCase("queen bed")
                    ||str.equalsIgnoreCase("single bed"))){
                System.out.println("please re-enter");
                str = input.nextLine();
            }if (str.equalsIgnoreCase("king bed")){
                totalPrice+=120;
            }else if (str.equalsIgnoreCase("queen bed")){
                totalPrice+=100;
            }else if (str.equalsIgnoreCase("single bed")){
                totalPrice+=80;
            }
            System.out.println("Your total price is: "+totalPrice+"$");
            System.out.println("Do you want another reservation?");
            str = input.nextLine();
            while (!(str.equalsIgnoreCase("yes")
                    ||str.equalsIgnoreCase("no"))){
                System.out.println("please re-enter Yes or No");
                str = input.nextLine();
            }if (str.equalsIgnoreCase("no")){
                System.out.println("Your total price is: "+totalPrice+"$");
                break;
            }
        }
    }
}

