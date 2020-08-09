package OficceHours.Practice_05_06_2020;


import java.util.ArrayList;

/**
 * create a class called ScrumTeam
 * 			Attributes:
 * 				name
 * 				List of Testers,
 * 				List of Developers,
 *
 * 			Actions:
 * 				hireTester
 * 				fireTester
 * 				hireDeveloper
 * 				fireDeveloper
 * 				DailyStandUp
 */
public class ScrumTeam {

    ArrayList<Tester> testersTeam = new ArrayList<>(); // arrayList for Testers
    ArrayList<Developer> devpTeam = new ArrayList<>(); // arrayList for Developers


    public void hireTester(Tester tester){
        testersTeam.add(tester);
    }

    public void fireTester(long id){
        testersTeam.removeIf( p -> p.employeeId == id );
    }

    public void hireDeveloper(Developer developer){
        devpTeam.add(developer);
    }

    public void fireDeveloper(long id){
        devpTeam.removeIf(x -> x.employeeId == id);
    }




}
