package OficceHours.Practice_05_13_2020;

public class Instances {

    String name;

    {
        name = "Aisha";
    }


    public static void main(String[] args) {

        Instances obj = new Instances();
        obj.name = "Aisha";

        System.out.println(obj.name);
    }


    public void printName(){

        System.out.println("Name is: "+ this.name);
    }
}
