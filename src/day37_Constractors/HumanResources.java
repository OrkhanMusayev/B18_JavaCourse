package day37_Constractors;

/**
 * 2.  create a class called HumanResources
 *      declare 5 variables of Employee as static
 *      use static block to:
 *                1.  initialize those static variables
 *                2.  set all the info of the Employees
 */
public class HumanResources {

    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();
    static Employee employee4 = new Employee();
    static Employee employee5 = new Employee();
/*
    public static void main(String[] args) {
        employee1.setInfo("Aisha",10112018,445566778,"Developer",150000,'F');
        employee2.setInfo("Amar",4224242,544445455,"SDET",140000,'M');
        employee3.setInfo("Mamed",5252542,555555555,"QA",130000,'M');
        employee4.setInfo("Aykhan",42442452,4444444,"Developer",120000,'M');
        employee5.setInfo("Shamil",42424242,88888888,"SDET",120000,'M');

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);
    }

 */

    static {

        employee1.setInfo("Aisha",10112018,445566778,"Developer",150000,'F');
        employee2.setInfo("Amar",4224242,544445455,"SDET",140000,'M');
        employee3.setInfo("Mamed",5252542,555555555,"QA",130000,'M');
        employee4.setInfo("Aykhan",42442452,4444444,"Developer",120000,'M');
        employee5.setInfo("Shamil",42424242,88888888,"SDET",120000,'M');


    }


}
