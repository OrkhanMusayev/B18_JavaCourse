package day42_Inheritance;

public class TestData2 extends Accessmodifiers {
    // now testdata inherited acessmodifier class ==> public, protected, default variables and methods can be used here

/*
publicVariable
protectedVariable
defaultVariable
publicMethod()
protectedMethod()
defaultMethod()
 */


    public static void main(String[] args) {

        // since we declared the variables in access modifier class as static ==> we can call them through class name
        // here we will call the variables BUT private variable cannot be called into inherited

        System.out.println( TestData2.publicVariable  );
        System.out.println( TestData2.protectedVariable );
        System.out.println( TestData2.defaultVariable );

        // here we will call the method that were created in AccessModifier class into here
        // only public, protected, and default methods only can be inherited and used here

        TestData2.publicMethod();
        TestData2.protectedMethod();
        TestData2.defaultMethod();

        // because they are static method we can call them like this too

        publicMethod();
        protectedMethod();
        defaultMethod();

    }


}