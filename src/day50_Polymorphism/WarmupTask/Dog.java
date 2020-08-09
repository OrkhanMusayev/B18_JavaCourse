package day50_Polymorphism.WarmupTask;

/**
 * 3. create subclass of Animal named Dog
 *  *             variable: dogName
 *  *             methods: bark
 */
public final class Dog extends Animal{ // 3 variables,3 instance methods

    public String dogName;

    public Dog(String dogName, String gender, int Age){
        this.dogName=dogName;
        this.gender=gender;
        this.Age=Age;
    }
    public void bark(){
        System.out.println("Dog "+dogName+" Is Barking");
    }

    @Override
    public void eat(){
        System.out.println("Dog "+dogName+" Is Eating");
    }
    @Override
    public void sleep(){
        System.out.println("Dog "+dogName+" Is Sleeping");
    }
}
