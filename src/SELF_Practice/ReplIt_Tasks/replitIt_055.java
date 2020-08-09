package SELF_Practice.ReplIt_Tasks;

import java.util.Scanner;

public class replitIt_055 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int numOfDay =input.nextInt();
        String result="";
        switch(numOfDay){
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid day";
                break;

        }

        System.out.println(result);
    }
}