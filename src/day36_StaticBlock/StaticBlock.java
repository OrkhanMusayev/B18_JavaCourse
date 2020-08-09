package day36_StaticBlock;

public class StaticBlock {

    static { // doesn't matter i can create static block before or after main method
            // static block executed first,runs first, only runs one time
        //		executed as soon as class is loaded
        System.out.println("Static Block");
    }

    public static void main(String[] args) {

        System.out.println("Main Method");
        method1();
    }

    public static void method1(){ // for print this statement i have to call under main method
        System.out.println("Custom method");
    }
}
