package day50_Polymorphism.WarmupTask;

/**
 * Warmup tasks:
 *     1. cerate a class Animal
 *             variables: age, gender
 *             methods: eat, sleep
 *         DO NOT make abstract we need this for today's example
 *     2. create subclass of Animal named Cat
 *             variable: catName
 *             methods: scratch
 *     3. create subclass of Animal named Dog
 *             variable: dogName
 *             methods: bark
 */
public abstract class Animal { // 2 variables,2 instance methods

    public int Age;
    public String gender;

    public void eat(){
        System.out.println("Animal is Eating");
    }

    public void sleep(){
        System.out.println("Animal is Sleeping");
    }

    public static void methodA(){
        System.out.println("Animal class");
    }
}
