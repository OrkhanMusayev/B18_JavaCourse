package WarmpUpTasks.REPEATALLWARMUPS;

/**
 *  write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
 *   write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
 */
public class DivisibleBy3_5 {

    public static void main(String[] args) {

        for(int i=1; i <= 100; i++){ // we also can use iterator i+=2 for finding odd numbers

            if( i % 2 !=0 ){

                if( i % 3 == 0 && i % 5 == 0)

                System.out.print(i+" ");


                }
            }



        for(int x = 0; x <=100; x++){ // Even numbers
            if( x % 2 == 0){
                if( x % 3 == 0 && x % 5 == 0){
                    System.out.println(x+" ");
                }
            }
        }
        }



    }

