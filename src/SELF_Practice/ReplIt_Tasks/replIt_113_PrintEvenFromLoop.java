package SELF_Practice.ReplIt_Tasks;
/*
Write a for loop that prints all the even integers from 80 through 20 inclusive, separated by spaces.
MUST USE FOR EACH LOOP
 */
public class replIt_113_PrintEvenFromLoop {

    public static void main(String[] args) {
        String result = "";
        for (int i = 80; i >= 20; i--) {
            if (i % 2 == 0) {
                //System.out.print(i+" ");
                result += i + " ";
            }

            }
        String[] split = result.split(" ");
        for (String each : split) {
            System.out.print(each+" ");




        }
    }
}
