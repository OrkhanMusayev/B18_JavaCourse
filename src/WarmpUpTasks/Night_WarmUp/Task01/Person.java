package WarmpUpTasks.Night_WarmUp.Task01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * create a class called Person
 * 				attributes:  name, age, gender
 * 				methods: eat, walk, sleep, setPersonInfo
 */
public class Person {

    public String name;
    public int age;
    public char gender;


    public void eat(String food){
        System.out.println(name+" Is eating "+food);
    }

    public void walk(){
        System.out.println(name+" Is walking");
    }

    public void sleep(){
        System.out.println(name+" Is sleeping");
    }

    public void setPersonInfo(String name, int age, char gender){

        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}


//================================================================================================================


/**
        * create a sub class of person called Employee
  				attributes: name, age, gender, Salary, employeeID, jobTitle
         * 				methods: work, setEmployeeInfo, toString
         */

class Employee extends Person{

    public double salary;
    public long employeeID;
    public String jobTitle;

    public void work(){
        System.out.println(name+" Is Working");
    }

    public void setEmployeeInfo(String name, int age, char gender, double salary, long employeeID, String jobTitle){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
    }

    public String toString(){
        return "Name: "+name+ ", Age "+age+ ", Gender "+gender+ ", Salary $"+salary+ ", Employee ID"+employeeID+", job"+jobTitle;
    }
}

//================================================================================================================

/**
 * create a subclass of Person called Student
 * 				attributes: name, age, gender, studentID, clazz
 * 				methods: attendClass, code, setStudentInfo, toString
 */

class Student extends Person{

    public long studentID;
    public String clazz;

    public void attendClass(){
        System.out.println(name+" Is attending class");
    }

    public void code(){
        System.out.println(name+" Is coding");
    }

    public void setStudentInfo(String name, int age, char gender, long studentID, String clazz){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.studentID = studentID;
        this.clazz = clazz;
    }

    public String toString(){

        return "Name: "+name+ ", Age "+age+ ", Gender "+gender+ ", Student ID "+studentID+ ", Class "+clazz;
    }
}

//================================================================================================================


/**
 * create a class called school:
 * 					create 3 objects of student and set their info
 * 					create a an ArrayList of students to store all student objects
 * 					use for each loop to print out each students' name and studentID
 */

class School {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setStudentInfo("Asif",5,'F',1234,"A");

        Student student2 = new Student();
        student2.setStudentInfo("Vasif",8,'F',5678,"B");

        Student student3 = new Student();
        student3.setStudentInfo("Agasif",10,'F',7412,"C");

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(student1,student2,student3));

        for(Student each : studentList){
            System.out.println(each.name+" "+each.studentID);
        }


    }
}

//================================================================================================================


/**
 * create a class called company:
 * 					create 3 objects of employee and set their info
 * 					create an array of employees and store all those employee objects
 * 					use regular for loop to print out each employee' name and employeeID
 */

class Company {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setEmployeeInfo("Khabib",31,'M',1000000,12345678,"UFC Fighter");

        Employee employee2 = new Employee();
        employee1.setEmployeeInfo("Tony",36,'M',1000000,32165497,"UFC Fighter");

        Employee employee3 = new Employee();
        employee1.setEmployeeInfo("McGregor",31,'M',1000000,98745632,"UFC Fighter");


        Employee[] employees = {employee1,employee2,employee3};
        for(int x = 0; x < employees.length; x++){
            System.out.println("Name: "+employees[x].name+", ID: "+employees[x].employeeID);
        }


    }
}


