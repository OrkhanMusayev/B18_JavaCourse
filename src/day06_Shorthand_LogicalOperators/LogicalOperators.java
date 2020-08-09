package day06_Shorthand_LogicalOperators;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean result1 = true;
        System.out.println(!result1);// false (opposite of true is false)

        boolean result2 = 10 +15 >15; // true
        System.out.println(!result2); // false

        boolean result3 = !true == !false;
                        // false == true ==> FALSE
        System.out.println(result3);


        boolean R1 = "Corona Virus " != "End of the world" && "Toilet paper" == "Cure";
                     //true && false ==> false

        boolean R2 = 10>15 && 15<13;
           // false && false ==> false
        System.out.println(R1);
        System.out.println(R2);

        boolean R3 = 'a' == 'b'-1 && 'b'+1 == 'c';
        //           97 == 98-1   && 98+1 == 99 ==> true
        System.out.println(R3);

        boolean R4 = true != false || false == !true;
               //           true   || true ==> true
        System.out.println(R4);

        boolean R5 = true != false && !false == !true;
                //    true         && false   ==> true

        boolean R6 = !!!false; // true
                   // !! true
                  // ! false
                  // true
        System.out.println(R6);






    }


}
