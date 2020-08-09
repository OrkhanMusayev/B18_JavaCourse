package day50_Polymorphism.WarmupTask;

/**
 * 2. create subclass of Animal named Cat
 *  *             variable: catName
 *  *             methods: scratch
 */
public final class Cat extends Animal{// 3 variables,3 instance methods

    public String catName;

    public Cat(String canName, String gender, int Age){
        this.catName=canName;
        this.gender=gender;
        this.Age=Age;
    }

    public void scratch(){
        System.out.println("Cat "+catName+" Is Scratching");
    }

    @Override
    public void eat(){
        System.out.println("Cat "+catName+" Is Eating");
    }
    @Override
    public void sleep(){
        System.out.println("Cat "+catName+" Is Sleeping");
    }
}
