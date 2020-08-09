package day33_CustomClass;

public class Car {

    String model;
    String brand;
    String color;
    int year;

    public void start(){
        System.out.println(brand+" is started");
    }

    public void drive(){
        System.out.println("Driving "+brand+" "+model);
    }

    public void getCarInfo(){

        System.out.println(year+" "+brand+" "+model+" "+color);
    }

    public void setCarInfo(String carBrand,String carModel, String carColor, int yearOfCar){
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = yearOfCar;
    }

    public String toString(){

        String result = year+" "+brand+" "+model+" "+color;
        return result;
    }
    public static void main(String[] args) {

        int a =100; // a is Local variable








    }
}
