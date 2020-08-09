package SELF_Practice.ReplIt_Tasks;

import java.util.Scanner;

public class replIt_056_LaptolConfigurator_StringMethods {

    public static void main(String[] args) {
        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0 ;
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();
        if (screenSize == 13.3){
            price += 200;
        } else if (screenSize == 15){
            price += 300;
        } else if (screenSize == 17.3){
            price += 400;
        } else {
            System.out.println("Invalid Screen Size");
            System.exit(0);
        }

        System.out.println("Select CPU type:");
        cpu = scan.next();
        if(cpu.equalsIgnoreCase("i3")){
            price += 150;
        } else if (cpu.equalsIgnoreCase("i5")){
            price += 250;
        } else if (cpu.equalsIgnoreCase("i7")){
            price += 350;
        } else {
            System.out.println("Invalid CPU");
            System.exit(0);
        }

        System.out.println("Select RAM size:");
        ram = scan.nextInt();
        price += (ram / 4) * 50;

        System.out.println("Select storage type:");
        storageType = scan.next();

        if ( !(storageType.equalsIgnoreCase("hdd") || storageType.equalsIgnoreCase("ssd") ) ){
            System.out.println("Invalid Storage Type");
            System.exit(0);
        }

        System.out.println("Enter memory size:");
        int memorySize = scan.nextInt();

        if(storageType.equalsIgnoreCase("hdd") ){
            price += (memorySize / 500) * 50;

        } else if (storageType.equalsIgnoreCase("ssd")){
            price += (memorySize / 500) * 100;
        }

        System.out.println("Enter screen resolution:");
        screenType = scan.next();

        if (screenType.equalsIgnoreCase("Fullhd")){
            price += 100;
        } else if (screenType.equalsIgnoreCase("4K")){
            price += 200;
        }

        System.out.println("Laptop price is: $" + price);



    }
}





