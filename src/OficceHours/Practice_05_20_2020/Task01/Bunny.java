package OficceHours.Practice_05_20_2020.Task01;

/**
 * Bunny:
 *         variables:  name, age, color, size, breed, isPet, numberOfeyes
 *         methods: eat, sleep, drink, toString, setInfo, Dig
 */
public class Bunny extends Pet{


    public Bunny(String name, int age, String color, String size, String breed){
        setInfo(name,age,color,size,breed);

    }
    public void Dig(){

        System.out.println(name+" is digging");
    }

}
