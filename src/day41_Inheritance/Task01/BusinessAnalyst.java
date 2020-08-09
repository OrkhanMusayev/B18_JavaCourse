package day41_Inheritance.Task01;

/**
 *  create subclass of employee name it businessAnalyst
 *      		variables: salary, name, id, jobTitle, gender
 *      		actions: writingRequiremnts, gathering
 *      		create a constructor that can initialize all the attributes of businessAnalyst
 */
public class BusinessAnalyst extends Employee{

        /*
    name (Inherited)
    salary (Inherited)
    ID (Inherited)
    jobTitle (Inherited)
    gender (Inherited)

    writingRequirements() (declared)
    gathering()   (declared)
    toString() (Inherited)
     */



    // Constructor
    public BusinessAnalyst(String name, double salary, long ID, char gender){

            this.name = name;
            this.salary = salary;
            this.ID = ID;
            this.jobTitle = "Business Analyst";  // we can do this because we only have one title for business analysts which is Business Analyst
            this.gender = gender;
        }


    // we don't need to reinitialize the variables above: they are inherited from Employee class
    // Also toString() method is inherited
    // we will just create methods requested and related to this class

        public void writingRequirements(){

            System.out.println(name+" Is Writing Requirements");
        }

        public void gathering(){

            System.out.println(name+" Is Gathering Requirements");
        }
}
