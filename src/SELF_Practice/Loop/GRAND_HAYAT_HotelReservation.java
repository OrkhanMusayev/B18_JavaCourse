package SELF_Practice.Loop;

import java.util.Scanner;

public class GRAND_HAYAT_HotelReservation {
/*
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
        System.out.println("=================================");
        System.out.println("||                             ||");
        System.out.println("||    WELCOME TO GRAND HAYAT   ||");
        System.out.println("||                             ||");
        System.out.println("=================================");
        int totalPrice = 0;
        while (true){
            System.out.println("which bedroom do you wanna reserve?");
            String Input = input.nextLine();
            while (!(Input.equalsIgnoreCase("king bed")
                    ||Input.equalsIgnoreCase("queen bed")
                    ||Input.equalsIgnoreCase("single bed"))){
                System.out.println("please re-enter");
                Input = input.nextLine();
            }if (Input.equalsIgnoreCase("king bed")){
                totalPrice+=120;
            }else if (Input.equalsIgnoreCase("queen bed")){
                totalPrice+=100;
            }else if (Input.equalsIgnoreCase("single bed")){
                totalPrice+=80;
            }
            System.out.println("your total price is: "+totalPrice+"$");
            System.out.println("Do you wanna another reservation?");
            Input = input.nextLine();
            while (!(Input.equalsIgnoreCase("yes")
                    ||Input.equalsIgnoreCase("no"))){
                System.out.println("please re-enter Yes OR No");
                Input = input.nextLine();
            }if (Input.equalsIgnoreCase("no")){
                System.out.println("your total price is: "+totalPrice+"$");
                break;
            }
        }
    }
}

