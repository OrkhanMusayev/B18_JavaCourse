package SELF_Practice.ReplIt_Tasks;
import java.util.Scanner;


public class replIt_Burger_Chicken_045 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String in = s.next();

        double output1 = 10.0;
        //your code here

        if(in.equals("burger") || in.equals("chicken")){
            System.out.println(output1);
        }
        double output2=2.0f;
        if(in.equals("soda")){
            System.out.println(output2);
        }


    }
}
