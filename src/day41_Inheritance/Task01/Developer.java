package day41_Inheritance.Task01;

/**
 * create subclass of employee name it developer:
 * 	     variables: salary, name, id, jobTitle, gender
 * 	     action: fixingBug, coding
 * 	     create a constructor that can initialize all the attributes of developer
 */
public class Developer extends Employee {

    /*
    name (Inherited)
    salary (Inherited)
    ID (Inherited)
    jobTitle (Inherited)
    gender (Inherited)

    fixingBug() (declared)
    coding()   (declared)
    toString() (Inherited)
     */



    //Constructor
    public Developer(String name, double salary, long ID, String jobTitle, char gender){

        this.name = name;
        this.salary = salary;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }

    // we don't need to reinitialize the variables above: they are inherited from Employee class
    // Also toString() method is inherited
    // we will just create methods requested and related to this class

    public void fixingBug(){

        System.out.println(name+" Is Fixing the Bug");
    }

    public void coding(){

        System.out.println(name+" Is Coding");
    }
}
