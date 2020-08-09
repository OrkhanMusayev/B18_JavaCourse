package day37_Constractors;

import java.util.ArrayList;

/**
 * in the main method:
 * 1.  create a List of Employees
 * 2.  add random two employees from HumanResources to the List
 * 3.  use for each loop to print out the employee info
 */
public class BankOfAzerbaijan {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(HumanResources.employee3); // index num is 0
        list.add(HumanResources.employee5); // index num is 1

        System.out.println(list.get(0));
        System.out.println(list.get(1));




    }
}
