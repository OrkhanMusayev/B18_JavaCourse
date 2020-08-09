package day42_Inheritance;

class test {   //  SUPER CLASS

    // to create SUPER CLASS constructor here:
    public test(){
        System.out.println("A");
    }



}


public class Constructor extends test {

    // to create SUB CLASS constructor here:
    public Constructor(){

        System.out.println( "B");
    }



    public static void main(String[] args) {

        // test obj = new test();  // A
        Constructor obj2 = new Constructor(); // AB

    }


}
