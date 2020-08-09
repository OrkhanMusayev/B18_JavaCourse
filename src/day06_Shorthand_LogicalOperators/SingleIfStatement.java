package day06_Shorthand_LogicalOperators;

public class SingleIfStatement {

    public static void main(String[] args) {

        boolean coldWather = true ;

        if (coldWather){
             //
            System.out.println("Where is your hat");

            System.out.println("Where is your jacket");

        }

        boolean coronaDetected = true;

        if(coronaDetected){
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more java coding");
        }

        System.out.println("================================================================================================");

        int a = 200;
        boolean evenNumber = a % 2 == 0; // if a number can be divided  by 2 without the remainder
        boolean oddNumber = a % 2!=0 ; // if a number can not be divided by 2 evenly
        if(oddNumber){
            System.out.println(a + " is odd number ");
        }

        if (evenNumber){ // if the number is not even number,then it must be odd
            System.out.println(a + " is even number ");
        }








    }
}
