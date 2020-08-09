package SELF_Practice.ReplIt_Tasks;
import java.util.Scanner;
public class replIt_phoneNumber_023 {

    public static void main(String[] args) {
        //YOUR CODE IS HERE
        Scanner input=new Scanner(System.in);

        int areaCode=input.nextInt();
        int localNumber=input.nextInt();

        String phoneNum = "("+areaCode+")"+"-"+localNumber;
        System.out.println("Calling number "+phoneNum);

    }

}




