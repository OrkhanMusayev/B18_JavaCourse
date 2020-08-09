package OficceHours.Practice_05_06_2020;

import day24_Methods.Test;

public class AppleINC {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Orkhan","Junior Tester",150000, 1993);

        Tester tester2 = new Tester();
        tester2.setInfo("Amar","Junior Tester",120000, 2019);


        Tester tester3 = new Tester();
        tester3.setInfo("Aisha","Junior Tester",200000, 2018);

        ScrumTeam scrum1 = new ScrumTeam(); // we can use the arrayList in scrum class
        scrum1.hireTester(tester3);
        scrum1.hireTester(tester1);
        scrum1.hireTester(tester2);

        scrum1.fireTester(1993);

       // scrum1.testersTeam // returns the testersTeam arrayList from scrum1

        for(Tester each : scrum1.testersTeam){ // prints out every single tester from scrumTeam
            System.out.println(each);
        }

        System.out.println("=========================================================================================");

        Developer dev1 = new Developer();
        dev1.setInfo("Kim", "Junior Developer", 120000, 90678);

        Developer dev2 = new Developer();
        dev2.setInfo("Emrah", "Usta Developer", 100000,223232);

        scrum1.hireDeveloper(dev1);
        scrum1.hireDeveloper(dev2);

        //scrum1.fireDeveloper(90678);


        System.out.println(scrum1.devpTeam.size()); // after first hire size gonna be = 1

        for(Developer each : scrum1.devpTeam){ // arrayList of developer in scrum team
            System.out.println(each);
        }

        System.out.println("=========================================================================================");


        System.out.println("In my scrum team, We have "+scrum1.testersTeam.size()+" testers and "+scrum1.devpTeam.size()+" developers");


        /**
         * create scrum2 : 4 developers, 2 testers
         * create scrum3 : 5 developers, 3 testers
         *
         * create an array of scrum: {scrum1, scrum2, scrum3 };
         *    1. Iterator the array to print out all the testers who have salary > 120000
         *    2. Print out all the developers whi have salary < 120000
         *
         * create an ArrayList of scrum: {scrum1, scrum2, scrum3 };
         *    1. Remove all the testers who have salary < 100000
         *    2. Remove all the developers who have salary < 120000
         *
         * NOTE: DO NOT create any ArrayList of Testers or Developers
         *       Use the ArrayList in ScrumTeam class only
         *
         */
    }
}
