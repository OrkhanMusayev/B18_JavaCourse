package WarmpUpTasks.Night_WarmUp;

/**
 * 1. Create a class called Employee
 * 			instance variables:
 * 					name, id, ssn, jobTitle, salary, gender
 * 			actions:
 * 					setEmployeeInfo(): can initialize all the instance variables
 * 					toString(): can return the info of the employee as string
 */
public class Employee {

    String name;
    long id;
    long ssn;
    String jobTitle;
    double salary;
    String gender;


    public void setEmployeeInfo(String name, long id, long ssn, String jobTitle, double salary, String gender){

        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;

    }

    public String toString(){

        return "Employee name is: "+name+" Id: "+id+" SSN: "+ssn+" Job Title: "+jobTitle+" Salary: $"+salary+" Gender: "+gender;
    }



}
