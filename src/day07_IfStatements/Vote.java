package day07_IfStatements;
/*
5. Write a java program that can identify if a person is eligible to vote for Donald Trump
 */

public class Vote {
    public static void main(String[] args) {

        int age =18;
        boolean UScitizen = true;
        boolean likeDonald = true;

        boolean eligible = age >= 18 && UScitizen == true;
        if(eligible){
            System.out.println("You are eligible to vote");
        }

        if(!eligible){
            System.out.println("You are not eligible to vote");
        }









    }
}
