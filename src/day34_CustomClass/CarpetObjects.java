package day34_CustomClass;


import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {

    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(7,8.5,20,true);
        carpets[1].customOrder(10,15,30,false);
        carpets[2].customOrder(9,20,15,true);
        carpets[3].customOrder(20,18,25,false);
        carpets[4].customOrder(35,45,35,true);

        System.out.println(carpets[0]);
        System.out.println("=========================================================================");
        System.out.println(carpets[1]);
        System.out.println("=========================================================================");
        System.out.println(carpets[2]);
        System.out.println("=========================================================================");
        System.out.println(carpets[3]);
        System.out.println("=========================================================================");
        System.out.println(carpets[4]);

        System.out.println("=========================================================================");

        ArrayList<Carpet> persianCarpets = new ArrayList<>();

        for(Carpet eachPersianCarpets : carpets){
            if(eachPersianCarpets.isPersian){
                persianCarpets.add(eachPersianCarpets);
            }
        }
        System.out.println("There are "+persianCarpets.size()+" Persian Carpets");

        System.out.println( persianCarpets.get(0).calcCost() );
        System.out.println( persianCarpets.get(1).calcCost() );

        System.out.println("=========================================================================");


        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));
        //regularCarpets.removeAll(persianCarpets); we can use removeAll() also removeIf()
        regularCarpets.removeIf(p->p.isPersian);
        System.out.println("There are "+regularCarpets.size()+" Regular Carpets");

        for(int i=0; i < regularCarpets.size(); i++){
            System.out.println( regularCarpets.get(i) );
        }







    }
}
