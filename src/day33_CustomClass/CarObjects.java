package day33_CustomClass;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car(); // object 1
        car1.brand = "BMW";
        car1.model = "X7";
        car1.color = "White";
        car1.year = 2020;


        // System.out.println(brand); have to call from class name
        System.out.println( car1.brand ); // instance variables are object variables,we can call them through the object name
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.year);

        car1.start();
        car1.drive();
        car1.getCarInfo();

        System.out.println("======================================================================================================");

        Car car2 = new Car(); // object 2

        car2.brand = "Honda";
        car2.model = "Pilot";
        car2.color = "Black";
        car2.year = 2019;

        System.out.println( car2.brand );
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.year);

        car2.start();
        car2.drive();
        car2.getCarInfo();

        System.out.println("======================================================================================================");

        Car car3 = new Car(); // object 3

        car3.brand = "Mercedes";
        car3.model = "G Class";
        car3.color = "Black";
        car3.year = 2020;

        car3.getCarInfo();
        car3.start();
        car3.drive();

        System.out.println("======================================================================================================");

        String str1 = "A";
        String str2 = "B";

        String[] arr = {str1,str2};

        Car[] cars = {car1,car2,car3};

        cars[0].getCarInfo();
        cars[1].getCarInfo();
        cars[2].getCarInfo();

        System.out.println("======================================================================================================");

        /**
        Crete 5 car object
         put them in an array of cars
         use for loop to get each car info
         use for each loop to get each CarInfo
         */




    }
}
