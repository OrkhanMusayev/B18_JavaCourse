package SELF_Practice.ReplIt_Tasks;

import java.util.Scanner;

public class replIt_VideoGameCoupons_34 {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupon = input.nextInt();

        if(coupon>=3) {
            System.out.println("Number of Candies: " + (coupon / 10));
            System.out.println("Number of Gumballs: " + (coupon % 10) / 3);

        }

        else{
            System.out.println("Not enough coupons");




        }



    }
}
