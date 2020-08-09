package SELF_Practice.Arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class EnterStudetsName_04_09_2020 {

    /*
      write a program that asks "enter a name" 10 times,
       and store each of the names in the array students
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter student's name");
        String[] students = new String[10];
        students[0] = input.next();
        students[1] = input.next();
        students[2] = input.next();
        students[3] = input.next();
        students[4] = input.next();
        students[5] = input.next();
        students[6] = input.next();
        students[7] = input.next();
        students[8] = input.next();
        students[9] = input.next();

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }












    }
}
