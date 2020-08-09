package WarmpUpTasks.Night_WarmUp;

/**
 * Task01:
 * 		1. create an abstract class called Pets
 * 				attributes: name, age, color, breed, gender
 * 				methods:
 * 					abstract methods: sleep, eat, speak
 * 					instance method: toString
 * 		2. create three sub classes (non-abstract) of pet:
 * 								1. Dog
 * 								2. Cat
 * 								3. Tiger
 * 				each class MUST have constructors to initialize the attributes
 */
public abstract class Pets {

    public String name;
    public int age;
    public String color;
    public String breed;
    public char gender;


    public abstract void sleep();
    public abstract void eat();
    public abstract void speak();


}

class Dog extends Pets{

    public Dog(String name,int age,String color,String breed,char gender){
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;

    }

    @Override
    public void eat(){
        System.out.println(name + " Is Eating");
    }
    @Override
    public void sleep(){
        System.out.println(name+" Is Sleeping");
    }
    @Override
    public void speak(){
        System.out.println(name+" Is Speaking");
    }

    public String toString(){
        return "Dog Name is: "+name+", Age: "+age+", Color: "+color+", Breed: "+breed+", Gender: "+gender;
    }


}

class Cat extends Pets{

    public Cat(String name,int age,String color,String breed,char gender){
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
    }


    @Override
    public void eat(){
        System.out.println(name + " Is Eating");
    }
    @Override
    public void sleep(){
        System.out.println(name+" Is Sleeping");
    }
    @Override
    public void speak(){
        System.out.println(name+" Is Speaking");
    }

    public String toString(){
        return "Cat Name is: "+name+", Age: "+age+", Color: "+color+", Breed: "+breed+", Gender: "+gender;
    }

}

class Tiger extends Pets {

    public Tiger(String name, int age, String color, String breed, char gender) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;

    }


    @Override
    public void eat(){
        System.out.println(name + " Is Eating");
    }
    @Override
    public void sleep(){
        System.out.println(name+" Is Sleeping");
    }
    @Override
    public void speak(){
        System.out.println(name+" Is Speaking");
    }

    public String toString(){
        return "Tiger Name is: "+name+", Age: "+age+", Color: "+color+", Breed: "+breed+", Gender: "+gender;
    }

}

class PetsObjects{

    public static void main(String[] args) {

        Dog obj = new Dog("Malva",3,"Black","Caucasian Shepherd Dog",'M');
        obj.eat();
        obj.sleep();
        obj.speak();
        System.out.println(obj.toString());


    }
}
