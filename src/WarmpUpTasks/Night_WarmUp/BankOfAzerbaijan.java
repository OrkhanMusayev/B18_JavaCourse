package WarmpUpTasks.Night_WarmUp;


import java.util.ArrayList;

/**
 * 3. create class called BankOfAzerbaijan
 * 		in the main method:
 * 				1. create a List of Employees
 * 				2. add random two employees from HumanResources to the List
 * 				3. use for each loop to print out the employee info
 * 				4. now go back to HumanResources class and comment out the static block
 * 				5. repeat the step 3 to print out the employee info to compare it with previous output
 */
public class BankOfAzerbaijan {

    public static void main(String[] args) {


        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(HumanResources.employee1);
        employeeList.add(HumanResources.employee3);

        for( Employee each : employeeList){
            System.out.println(each);
        }
    }
}
