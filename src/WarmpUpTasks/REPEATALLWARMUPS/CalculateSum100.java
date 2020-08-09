package WarmpUpTasks.REPEATALLWARMUPS;
/**
   write a program that can calculate the sum of all the even numbers between 1 ~ 100
   write a program that can calculate the sum of all the odd numbers between 1 ~ 100
 */
public class CalculateSum100 {

    public static void main(String[] args) {

        int sumOfEven = 0;
        int sumOfOdd = 0;

        for(int i = 0; i <= 100; i++){

            if( i % 2 == 0 ){
                sumOfEven += i;
            }else{
                sumOfOdd += i;
            }
        }
        System.out.println("Sum of all even numbers: "+sumOfEven);
        System.out.println("Sum of odd even numbers: "+sumOfOdd);





    }
}
