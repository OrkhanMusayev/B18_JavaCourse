package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        // if we use MMM-output  Month like Apr,Sep,Jun
        // if we use MM-output Month like number 04,09,06
        // if we use MMMM-output full name of month


        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

        System.out.println("===============================================");

        /*
        create a date called birthday : month/day/year
               ex: 2020 04 23
               Aprl/23/20
         */

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("EEEE MMM/dd/yy");
        // if we use MMM-output  Month like Apr,Sep,Jun
        // E->Thu .... EEEE-> Thursday
        LocalDate birthday = LocalDate.of(2018,10,11);
        String str1 = birthday.format(dtf1);
        System.out.println(str1);


        LocalDate date2 = LocalDate.now();
        System.out.println(date2.format(dtf1));









    }
}
