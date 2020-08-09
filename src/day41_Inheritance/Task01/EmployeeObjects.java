package day41_Inheritance.Task01;

public class EmployeeObjects {

    public static void main(String[] args) {

    Developer dev1 = new Developer("Amar", 120000, 123, "Software Developer", 'M');

        //  dev1.reporting(); i can not call reporting because reporting action was in tester class
        //  tester sub class and developer sub class they do not have any relationship
    dev1.fixingBug();
    dev1.coding();

        System.out.println(dev1);

        System.out.println("=============================================================================");

        Tester tester1 = new Tester("Aisha",110000,321,"SDET",'F');

        // tester1.coding(); i can not call coding because coding action was in developer class
        // developer sub class and tester sub class they do not have any relationship
        tester1.testing();
        tester1.reporting();
        System.out.println(tester1);


        System.out.println("=============================================================================");


        BusinessAnalyst businessAnalyst1 = new BusinessAnalyst("Yegana",150000,456,'F');

        // BA1.coding(); i can not call coding because coding action was in developer class
        //  BA1.fixingBug(); i can not call fixing bug because fixing bug action was in developer class

        businessAnalyst1.writingRequirements();
        businessAnalyst1.gathering();
        System.out.println(businessAnalyst1);



}
}
