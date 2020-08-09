package day50_Polymorphism.WarmupTask;

public class AnimalObjects {

    public static void main(String[] args) {
        Dog obj1 = new Dog("Lucy","Female",5);
        System.out.println(obj1.dogName);
        obj1.bark();


        Animal obj2 = new Dog("Sharik","Male",3);
        //System.out.println(obj2.dogName);
        //obj2.bark();
        obj2.eat();
        obj2.methodA();

        Animal animal1 = new Cat("A","F",1);

        boolean isCat = animal1 instanceof Cat;
        System.out.println(isCat);

        Dog d1 = new Dog("A","F",1);
       // boolean r1 = d1 instanceof Cat; // there us no IS A relation
        Animal animal2 = new Cat("Q","F",3);

        boolean r2 = animal2 instanceof Dog;
        System.out.println(r2);
    }
}
