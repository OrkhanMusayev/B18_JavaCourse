package OficceHours.Practice_05_20_2020.Task01;

/**
 *  Dog:
 *         variables:  name, age, color, size, breed, isPet, numberOfeyes
 *         methods: eat, sleep, drink, toString, setInfo, bark
 */
public class Dog extends Pet{


    public Dog(String name, int age, String color, String size, String breed){

        setInfo( name,age,color,size,breed );
    }
    public void bark(){

        System.out.println(name+" is barking");

    }

}
