package day39_AccessModifiers;

public class CarObjects {

    public static void main(String[] args) {
        // new Constructor

        Car car1 = new Car("Toyota");
        System.out.println(car1);

        Car car2 = new Car("Honda","Pilot");
        System.out.println(car2);

        Car car3 = new Car("BMW","X7",2020);
        System.out.println(car3);

        Car car4 = new Car("Lexus","LX",2020,90000);
        System.out.println(car4);

    }
}
