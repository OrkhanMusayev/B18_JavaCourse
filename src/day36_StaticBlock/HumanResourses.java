package day36_StaticBlock;

import OficceHours.Practice_05_06_2020.Developer;

public class HumanResourses {

    //dev1.setInfo("Amar","Developer",120000,12345);
    static Developer dev1 = new Developer();
    static Developer dev2 = new Developer();
    static Developer dev3 = new Developer();
    static Developer dev4 = new Developer();
    static Developer dev5 = new Developer();
/*
    public static void main(String[] args) {

        dev1.setInfo("Amar","Developer",120000,12345);
    }

 */
     static {
         dev1.setInfo("Amar","Developer",120000,12345);

}
}