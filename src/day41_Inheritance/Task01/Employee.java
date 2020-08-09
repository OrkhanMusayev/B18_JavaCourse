package day41_Inheritance.Task01;

/**
 * Task01:
 * 	create  class called Employee:
 * 			variables: salary, name, id, jobTitle, gender
 * 			Actions: toString
 */
public class Employee {

    public double salary;
    public String name;
    public long ID;
    public String jobTitle;
    public char gender;

    public String toString(){

        return "Name: "+name+", Job Title: "+jobTitle+", Salary: $"+salary+", ID: "+ID+", Gender: "+gender;
    }

}
