package OficceHours.Practice_03_11_2020;

public class Practice_Variables {

    /*
        brand
        year
        price
        model
        Maximummiles
         */

    public static void main(String[] args) {

    // system.out.prinln(brand); variables that are decleared in a block,must be initialized before use


String brand = "Toyota";
short year = 2020;
float price = 30000.25f;
String model = "Camry";
long maximummiles = 1000000;

        System.out.println(brand);
        System.out.println("brand");

        System.out.println("The vehicle " + year + " "+brand+" "+model+", has "+maximummiles
                + " miles, price is " +price + " USD" );

        System.out.println("=================================================================================");

        /*
     output:
        The vehicle 2020 BMW X6, has 32767 miles, price is 50000.5 USD
      */

        String brandino = "BMW";
        short yearino = 2020;
        String modelino = "X6";
        long maxmilles = 32767;
        float priceino = 50000.5f;

        System.out.println("The vehicle "+ yearino+" "+brandino+" "+" "+modelino+","+"has"+" "+maxmilles+" "+"miles"+","+"price is"+" "+priceino+" "+"USD");









    }

}
