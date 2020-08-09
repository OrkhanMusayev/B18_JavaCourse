package WarmpUpTasks.Night_WarmUp.Task02;

/**
 * task02:
 * 		create a class called device:
 * 				attributes: brand, model, price, country
 * 				methods: toString
 */
public class Device {

    public String brand;
    public String model;
    public double price;
    public String country;


    public String toString() {

        return "Brand: "+brand+", Model: "+model+", Price: $"+price+", Country "+country;
    }
}


/**
 * create a class called TV:
 * 				attributes: brand, model, price, country
 * 				methods: watch, toString
 */
 class TV extends Device {

    public void watch(){

        System.out.println("Watching "+brand);
    }
}

/**
 * create ba class called phone:
 * 				attributes: brand, model, price, country
 * 				methods: call, text,  toString
 */
class Phone extends Device {

    public void call(){

        System.out.println(brand+" Is calling");
    }

    public void text(){

        System.out.println(brand+" Is texting");
    }
}

