package day02_Variables;

public class VariablesPractice {

    public static void main(String[] args) {
        /*
        salary,federaltax,statetax,loan,ssn
         */

        int salary = 120000;
        double federaltax = 0.18;
        float statetax = 0.065f;

        //salary after tax = salary(1-sum of taxes)

        double sumTaxes = federaltax + statetax;
        double salaryaftertax = salary * (1-sumTaxes);
        System.out.println(salaryaftertax);


        System.out.println("====================================================================================================");
        //area of the circle = r*r*pi
         double r = 5.5;
         double area = r*r*3.14;
        System.out.println(area);

        System.out.println("==============================================================================================");

        double kg = 60;
        double pound = kg * 2.5;
        System.out.println(pound);

    }
}
