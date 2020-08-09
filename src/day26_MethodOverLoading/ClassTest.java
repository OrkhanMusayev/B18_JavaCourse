package day26_MethodOverLoading;

/**
    first method: can find the sum of two int numbers
    second method: can find the sum of two double numbers
 */

public class ClassTest {

    public static void main(String[] args) {

        // 10,10
        sum(10,10);
        // 15,15
        sum(1.5,2.5);




    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void sum(double a, double b){
        System.out.println(a+b);
    }
}
