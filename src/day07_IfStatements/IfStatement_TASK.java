package day07_IfStatements;

public class IfStatement_TASK {
    public static void main(String[] args) {

       int number1 = 4;
       int number2 = 8;
       int number3 = 1;

       if(number1>number2 && number1>number3){ // false
           System.out.println("The greatest number is: "+ number1);
        }
       if(number2>number1 && number2>number3){ // true
           System.out.println("The greatest number is: "+number2);
       }
        if(number3>number1 && number3>number2){ // false
            System.out.println("The greatest number is: "+number3);
        }

        System.out.println("===========================================");







    }
}
