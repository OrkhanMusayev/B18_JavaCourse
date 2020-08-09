package day28_DateTime;

import java.time.LocalDate;

/**
   1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store their birthdays in the same order
	3. use for loop to print out your friends' names and their birthdays
 */

public class LocalDate_Practice {

    public static void main(String[] args){

        String[] friends = {"Orkhan", "Aisha", "Amar"};
        //                    0         1        2
        LocalDate OrkhanBirthday = LocalDate.of(1993,9,15);
        LocalDate AishaBirthday = LocalDate.of(2018,10,11);
        LocalDate AmarBirthday = LocalDate.of(2019,9,13);

        LocalDate[] birthdays = {OrkhanBirthday,AishaBirthday,AmarBirthday};
         //                           0              1              2
        for(int i = 0; i < friends.length; i++){
//            String name = friends[i];
//            LocalDate bd = birthdays[i]; both way right))

            System.out.println(friends[i]+"'s birthday is "+ birthdays[i]);
        }



    }
}
