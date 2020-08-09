package SELF_Practice.ReplIt_Tasks;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class replIt_SecondsConverter_032 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter second");
        int seconds = input.nextInt();
        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
         seconds = (seconds%3600)%60;

        System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");

        System.out.println("====================================================================");

        //Teacher's method

        System.out.println("Enter seconds:");
        int inputSeconds = input.nextInt();

        int minutes1 = (inputSeconds / 60) % 60;
        int hours1 = ((inputSeconds / 60) / 60) % 60;
        int seconds1 = inputSeconds % 60;
        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");















    }
}
