package OficceHours.Practice_05_20_2020.Task01;

public class House {
    public static void main(String[] args) {


        Dog dog1 = new Dog("Karabas",5,"Black","Large","Husky");
       // dog1.setInfo("Karabas",5,"Black","Large","Husky");
        System.out.println(dog1);

        System.out.println("=====================================================================");

        Dog dog2 = new Dog("Bobik",2,"Gray","Small","Labrador");
        System.out.println(dog2);

        dog2.bark();
        //dog2.scratch(); we can't call because scratch was in cat class

        System.out.println("=====================================================================");

        Cat cat1 = new Cat("Kiki",3,"Brown","Medium","Siamese ");
        //cat1.setInfo("Kiki",1,"Brown","Small","Siamese ");
        System.out.println(cat1);

        cat1.scratch();
        // cat1.bark(); we can't call because bark was in dog class

        System.out.println("=====================================================================");

        Bunny bunny1 = new Bunny("Pamuk",1,"white","small","Holland lop");
        System.out.println(bunny1);

        bunny1.Dig();
        // bunny1.scratch(); we can't call because scratch was in cat class




    }
}
