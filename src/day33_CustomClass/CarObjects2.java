package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

/**
 Crete 5 car object
 put them in an array of cars
 use for loop to get each car info
 use for each loop to get each CarInfo
 */

public class CarObjects2 {

    public static void main(String[] args) {


        Car car1 = new Car();
        car1.setCarInfo("BMW","X7","White", 2020);
        car1.getCarInfo();

        Car car2 = new Car();
        car2.setCarInfo("Honda","Pilot","Black",2019);
        car2.getCarInfo();

        Car car3 = new Car();
        car3.setCarInfo("Mercedes","G Class","Black",2020);
        car3.getCarInfo();

        System.out.println("======================================================================================================");


        Car[] cars = {car1,car2,car3};

        for(int i=0; i<cars.length; i++){
            cars[i].getCarInfo();
        }


        System.out.println("======================================================================================================");


        for(Car eachCar:cars){
            eachCar.getCarInfo();
        }

        System.out.println("======================================================================================================");

        System.out.println(car1);

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list1); // toString method gets executed automatically





    }
}
