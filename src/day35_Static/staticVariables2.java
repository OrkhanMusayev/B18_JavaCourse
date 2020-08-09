package day35_Static;

public class staticVariables2 {

    int insVariable; // every single object og the class has its own copy instances
    static int staticVariable; // there os only one copy of static shared by all objects

    public static void main(String[] args) {

        staticVariables2 obj1 = new staticVariables2();
        obj1.insVariable = 300;
        obj1.staticVariable = 400;

        staticVariables2 obj2 = new staticVariables2();

        System.out.println(obj1.insVariable); // 300
        System.out.println(obj2.insVariable); // 0

        System.out.println("==========================================================");

        System.out.println( obj1.staticVariable); // 400
        System.out.println(obj2.staticVariable); // 400

        System.out.println("==========================================================");

        System.out.println( staticVariables2.staticVariable ); // 400 ... static can be called through class name

        // System.out.println(StaticVariables2.insVariable ); // instance CAN NOT be called through class name
    }

}
