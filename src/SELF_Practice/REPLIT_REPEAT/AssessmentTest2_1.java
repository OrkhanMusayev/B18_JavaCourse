package SELF_Practice.REPLIT_REPEAT;

/**
 * Write a  for loop that prints the odd integers 11 through 121 inclusive, separated by spaces.
 */
public class AssessmentTest2_1 {

    public static void main(String[] args) {

        for(int x = 11; x <= 121; x++){
            if(x % 2 == 0){
                continue;
            }
            System.out.println(x+" ");
        }


    }
}
