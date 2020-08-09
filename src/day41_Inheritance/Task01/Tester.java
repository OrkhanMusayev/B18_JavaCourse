package day41_Inheritance.Task01;

/**
 * create sub class of employee name it Tester:
 * 			variables: salary, name, id, jobTitle, gender
 * 			actions: reportingBug, testing
 * 			create a constructor that can initialize all the attributes of Tester
 */
public class Tester extends Employee{

    /*
    name (Inherited)
    salary (Inherited)
    ID (Inherited)
    jobTitle (Inherited)
    gender (Inherited)

    reporting() (declared)
    testing()   (declared)
    toString() (Inherited)
     */


    // Constructor
    public Tester(String name, double salary, long ID, String jobTitle, char gender){

        this.name = name;
        this.salary = salary;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }

    // we don't need to create the variables above: they are inherited from Employee class
    // Also toString() method is inherited
    // we will just create methods requested and related to this class

    public void reporting(){
        System.out.println(name+" Is Reporting");
    }

    public void testing(){
        System.out.println(name+" Is Testing");
    }

}
