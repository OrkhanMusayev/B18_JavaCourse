package SELF_Practice.ReplIt_Tasks;

import java.util.Scanner;

public class replIt_LaptopConfigurator_056 {

    public static void main(String[] args) {

        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0 ;
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        System.out.println("Select screen size");
        screenType=scan.next();
        if(screenType.equals("13.3")){
            price+=200;
        }else if(screenType.equals("15.0")){
            price+=300;
        }else if(screenType.equals("17.3")){
            price+=400;
        }else{
            System.out.println("Incorrect screen size");
        }

        System.out.println("Enter CPU type:");
        cpu=scan.next();
        if(cpu.equals("i3")){
            price+=150;
        }else if(cpu.equals("i5")){
            price+=250;
        }else if(cpu.equals("i7")){
            price+=350;
        }else{
            System.out.println("Incorrect CPU type");
        }

        System.out.println("Enter RAM size:");
        ram=scan.nextInt();
        for(int i=4; i<=ram; i+=4){
            price+=50;
        }

        System.out.println("Select storage type");
        storageType=scan.next();
        if(storageType.equals("HDD")){

        }










    }
    }
