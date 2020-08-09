package day41_Inheritance;

public class Fish extends Animal {

    public void swim(){ // swimming is unique action of fish,that's why we create swim method here.

        System.out.println(name+" is swimming");
    }

    public static void main(String[] args) {

        // here we can create objects of fish

        Fish obj1 = new Fish();

        // I can call name, weight, size from fish object fish1

        obj1.name = "Nemo";
        System.out.println(obj1.name);

        obj1.weight = 5;
        System.out.println(obj1.weight);

        obj1.size = "Small";
        System.out.println(obj1.size);

        System.out.println("==========================================");

        // now let's try methods inherited from Animal class
        obj1.eat();  //  Nemo is eating
        obj1.move(); //  Nemo is moving

        // now I will call the method I created here swim()
        obj1.swim();

    }
}