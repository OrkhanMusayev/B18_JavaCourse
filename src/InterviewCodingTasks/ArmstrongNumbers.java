package InterviewCodingTasks;

/**
 * Write a method that can check if a number is Armstrong  number
 */
public class ArmstrongNumbers {

    public static boolean ArmStrongNumbers(int num){
        int a = 0; int b = 0; int c = num;

        while(num>0){ // 153

            a=num%10; // a=153%10 = 15.3 ~ reminder 3

            num/=10; // 153/10 = 15.3

            b=b+(a*a*a); // b=b+(3*3*3) = 27

        }
        if(c==b) { // num = 153 == 27

            return true;

        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("ArmStrongNumbers = " + ArmStrongNumbers(153));
    }
}
