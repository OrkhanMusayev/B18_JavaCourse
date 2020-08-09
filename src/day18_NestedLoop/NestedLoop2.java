package day18_NestedLoop;

public class NestedLoop2 {

    public static void main(String[] args) {

        /*
         *
         * *
         * * *
         * * * *
         * * * * *

         */

        for (int x = 1; x <= 5; x++) {

            for (int i = 1; i <= x; i++) {
                System.out.print("* ");

            }

            System.out.println();


        }

        System.out.println("====================================");

        for (int a = 9; a >= 0; a--) {
            for (int i = 1; i <= a; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("===========================================");

        for (char z = 'a'; z <= 'z'; z++) {
            for (char ch = 'a'; ch <= z; ch++) {
                System.out.print(ch + " ");

            }

            System.out.println();


        }

        System.out.println("===============================================");

        for (char z = 'z'; z >= 'a'; z--) {
            for (char ch = 'a'; ch <= z; ch++) {
                System.out.print(ch + " ");

            }

            System.out.println();

        }
        }
    }