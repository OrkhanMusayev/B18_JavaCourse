package day39_AccessModifiers;

public class EmployeeObjects {

    public static void main(String[] args) {


        Employee employee1 = new Employee("Amar");
        System.out.println(employee1);

        Employee employee2 = new Employee("Orkhan", "Mechanic");

        System.out.println(employee2);

        Employee employee3 = new Employee("Mamed", "SDET", 123);
        System.out.println(employee3);


        Employee employee4 = new Employee("Aykhan", "SDET", 456, 120000);
        System.out.println(employee4);

        Employee employee5 = new Employee("Aisha", "SDET", 789, 120005, 'M');
        System.out.println(employee5);
    }
}
