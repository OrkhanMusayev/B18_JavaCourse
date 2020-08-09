package day33_CustomClass;

/**
cat class:
      data/attributes:  instance variables
        breed, color, age
      actions: instance methods
        sleep(), eat(), drink()
 */


public class Cat {

    String name;
    String breed;
    String color;
    int age;


    public void sleep(){
        System.out.println(name+" is sleeping ");
    }

    public void eat(String catFood){
        System.out.println(name+" is eating "+ catFood);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+ drink);
    }


    public void setCatInfo(String catName, String catBreed, String catColor, int catAge){
        name = catName;
        breed = catBreed;
        color = catColor;
        age = catAge;

    }

    public String toString(){
        return name+", breed is "+breed+", color is "+color+", "+age+" years old";
    }

}
