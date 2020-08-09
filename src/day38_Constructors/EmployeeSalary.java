package day38_Constructors;

public class EmployeeSalary {

    public static void main(String[] args) {

        SalaryCalculator orkhan = new SalaryCalculator(65,40,3.07/100, 3.07/100);


        System.out.println(orkhan.salary() );
        System.out.println(orkhan);
        System.out.println(orkhan.salaryAfterTax());

        System.out.println("=====================================");



    }
}
