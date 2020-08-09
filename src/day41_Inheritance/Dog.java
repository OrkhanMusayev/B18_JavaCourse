package day41_Inheritance;

// if I want all variables and method from Animal class to be used here I can use inheritance
// so I add extends keyword

public class Dog extends Animal {

    /* we inherited from Animal(super class) to Dog(Sub class)
    public String name;
    public String size;
    public double weight;

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void move(){
        System.out.println(name+" is moving");
    }
     */

    public void bark(){ // barking is unique action of dog,that's why we create bark method here.

        System.out.println(name+" is barking");
    }

    public static void main(String[] args) {

        // I will create object:
        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        // we were able to get access to this variable name because I inherited from Animal class
        System.out.println(dog1.name);

        dog1.move();
        dog1.eat();

        // I can call here the method I created in this class which is only related to Dog class: bark()
        // I can not use the bark() method in another sub class like Fish class
        dog1.bark();    // Lucy is barking

    }
}
