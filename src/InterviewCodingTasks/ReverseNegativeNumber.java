package InterviewCodingTasks;

/**
 * Write a return method that can reverse negative number and return it as int
 */
public class ReverseNegativeNumber {

    public static int reverseNegativeNum(int num){
        String str = new StringBuilder(""+num).reverse().toString();
        if (num<0){
            str = "-" + str.substring(0,str.length()-1);

        }
        return Integer.valueOf(str);
    }

    public static void main(String[] args) {

        System.out.println("reverseNegativeNum = " + reverseNegativeNum(1990));
    }
}
