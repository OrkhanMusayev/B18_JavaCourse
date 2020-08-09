package WarmpUpTasks.Morning_WarmUp;

import java.time.LocalDate;

public class LocalDate_TeacherSolution_04_24_2020 {

    public static void main(String[] args){

        String[] friends = {"Amar", "Huseyn", "Shamil"};
        //                    0         1        2
        LocalDate AmarBirthday = LocalDate.of(2020,3,5);
        LocalDate HuseynBirthday = LocalDate.of(2000,10,12);
        LocalDate ShamilBirthday = LocalDate.of(2001,10,2);

        LocalDate[] birthdays = {AmarBirthday,HuseynBirthday,ShamilBirthday};
        //                           0              1              2
        for(int i = 0; i < friends.length; i++){
            String name = friends[i];
            LocalDate bd = birthdays[i];
            System.out.println(name+"'s birthday is "+ bd);
        }



    }
}
