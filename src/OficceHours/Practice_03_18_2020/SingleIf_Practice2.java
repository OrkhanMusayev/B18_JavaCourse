package OficceHours.Practice_03_18_2020;

public class SingleIf_Practice2 {
    public static void main(String[] args) {
/*
warmup task:
        write a program that can check the age of a person if he/she is qualified to buy alchohol
        write a code of happiness

 */
   byte age = 30;
   boolean eligibleToBuy = age > 21 || age == 21; // age >=21

   if(age>21){
       System.out.println("Here is your Vodka");
   }
    if (age<21){
        System.out.println("Go drink your milk");
    }

    boolean feeling = false;
    if(feeling == false){
        System.out.println("Don't be sad");
    }
     if (feeling == true){
         System.out.println("Stay happy");
     }













    }
}
