package OficceHours.Practice_03_11_2020;

public class SalaryCalculation {

    public static void main(String[] args) {

        int rate = 70;
        double stateTax = 0.04;
        double federalTax =0.22;
        int weeklyHours = 40;
        int totalWeek = 48;
        int salary = (weeklyHours * totalWeek) * rate;
        double deductTax = (stateTax + federalTax) * salary;
        System.out.println("Your salary is "+ salary);
        System.out.println("Your total Tax is "+ deductTax);
        System.out.println("Your income after tax is "+ (salary - deductTax)+" USD");
    }
}
