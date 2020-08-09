package day27_DateTime;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Class_Test {

    public static void main(String[] args) {

            String friends[] = {"Abdul", "Baris", "Sayed", "Parida", "Irina"};
            LocalDate[] birthdays = {LocalDate.of(1990, 1, 1),
                    LocalDate.of(1991, 2, 2),
                    LocalDate.of(1992, 3, 3),
                    LocalDate.of(1993, 4, 4),
                    LocalDate.of(1994, 5, 5),
            };
            for (int i = 0; i < friends.length; i++) {
                System.out.println(friends[i] + " -- " + birthdays[i]);
            }
        }
    }