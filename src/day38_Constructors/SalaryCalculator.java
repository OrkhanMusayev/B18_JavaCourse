package day38_Constructors;

/**
 *  Create class called SalaryCalculator
 *                 instance variables:
 *                     hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
 *
 *                 add a constructor can initialize those fields
 *
 *                  instance methods:
 *                     salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48)
 *                     stateTax(): retuns the total state tax as double ( salary * stateTaxRate)
 *                     federalTax(): retuns the total federal tax as double ( salary * fedralTaxRate)
 *                     salaryAftertax(): returns the salary after tax as double ( salary - stateTax - federalTax)
 *
 *                     toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
 */
public class SalaryCalculator {

    double hourlyRate;
    int weeklyHour;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHour, double stateTaxRate, double federalTaxRate){

        this.hourlyRate = hourlyRate;
        this.weeklyHour = weeklyHour;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;

    }

    public double salary(){ // annual income

        return hourlyRate * weeklyHour * 48; // yearly salary
    }

    public double stateTax(){

        return salary() * stateTaxRate; // calculate total state tax
    }

    public double federalTax(){

        return salary() * federalTaxRate; // calculate total federal tax
    }

    public double salaryAfterTax(){

        return salary() -  ( stateTax() + federalTax() ); // calculate NET PAID
    }

    public String toString() {

        return "Hourly Rate: $" + hourlyRate +
                "\nWeekly Hours: " + weeklyHour +
                "\nGross Salary: $" + salary() +
                "\nState Tax: $" + stateTax() +
                "\nFederal Tax: $" + federalTax() +
                "\nNet Salary: $" + salaryAfterTax();
    }
}
