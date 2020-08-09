package OficceHours.Practice_05_20_2020.Task01;

/**
 *  custom class: pet
 *             variables:  name, age, color, size, breed, isPet, numberOfeyes
 *             methods:    eat, sleep, drink, toString, setInfo
 */
public class Pet {

    protected String name;
    protected int age;
    protected String color;
    protected String size;
    protected String breed;

    static boolean isPet = true;
    static int numberOfEyes = 2;


    public void setInfo(String name,int age,String color,String size,String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
        this.breed = breed;
    }

    public void eat(String food){ System.out.println(name+" Is eating " + food);}

    public void sleep(String place) {System.out.println(name+" Is sleeping at "+place); }

    public void drink(String drink) { System.out.println(name+" Is drinking " + drink); }

    public String toString(){

        return "Name: "+name+", Age: "+age+", Color: "+color+", Size: "+size+", Breed: "+breed;
    }
}
