package day40_Encapsulation;

public class Quiz_Question12 {

    public static String name = "Osman";

    public Quiz_Question12(){ // constructor
        name = "Hilal";
    }

    {
        name = "Marionela"; // instance block
    }

    static{
        name = "Madina"; // static block
    }

    public static void main(String[] args) {
        // System.out.println(name); // Madina : static block gets executed first
        // there is nothing else to execute
        // and we haven't created an object
        // No object = No execution of instance block or Constructor

        // BUT ONCE WE CREATE THE OBJECT:

        // Quiz_Question12 obj  = new Quiz_Question12();

        // when we create object:
        // 1st execution = static block = Madina
        // then
        // 2nd execution = instance block = Marionella (instance block runs first then Constructor)
        // next
        // 3rd execution = Constructor = Hilal

        System.out.println(name); // Hilal

    }
}
