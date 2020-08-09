package day42_Inheritance;


class Test{ //  SUPER CLASS = PARENT CLASS

    public Test(int a){

        // here we will call the constructor with double parameter
        // we must do call constructor at first step
        // to call constructor into another one we use this()
        this(2.5); // C  // once this is executed (when we create an object) it will execute constructor with double
        System.out.println("A"); // A
    }

    public Test(double a){
        System.out.println("C");
    }
}


public class Constructor2 extends Test { //  SUB CLASS = CHILD CLASS

    // we will create a constructor here:
    public Constructor2(){
        super(10); //C A  // super() is used to call constructor from super class
        System.out.println("B"); //B
    }


    // to create objects:
    public static void main(String[] args) {

        Test obj = new Test(10);  //C A

        //  Constructor2 obj2 = new Constructor2(); //C A B

    }



}