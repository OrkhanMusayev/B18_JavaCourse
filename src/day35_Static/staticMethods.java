package day35_Static;

public class staticMethods {

    int a = 100; // instance variable
    static int b = 200;

    public static void main(String[] args) {

        //System.out.println(a); // static only accepts static

        staticMethods obj = new staticMethods();

        System.out.println(obj.a);

        System.out.println("===============================================");

        System.out.println(b);
        System.out.println(staticMethods.b);
        System.out.println(obj.b); // static prefer to be called through class name,not from object

    }

    public void method(){
        System.out.println(a);
        System.out.println(b);
    }
}
