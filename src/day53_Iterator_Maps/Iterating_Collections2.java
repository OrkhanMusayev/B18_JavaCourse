package day53_Iterator_Maps;

import java.util.*;

public class Iterating_Collections2 {

    public static void main(String[] args) {

        LinkedHashSet<String> names = new LinkedHashSet<>(Arrays.asList("Esmira", "VeVe", "Orxan",
                                                     "Orxan", "Ramil", "Ilham","Esmira", "Mumu"));

        System.out.println(names); // [Esmira, VeVe, Orxan, Ramil, Ilham, Mumu]

        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            String s = it.next();
            if (s.toLowerCase().contains("o")){
                it.remove();
            }
        }

        System.out.println(names); /// [Esmira, VeVe, Ramil, Ilham, Mumu]

        System.out.println("=================================");

        for ( Iterator<String> I= names.iterator(); I.hasNext(); ){
            String s = I.next();
            if (s.contains("o") || s.contains("O")){
                I.remove();
            }
        }
        System.out.println(names);

        System.out.println("===============================================");

        LinkedHashSet<String> namess = new LinkedHashSet<>(Arrays.asList("Esmira", "VeVe", "Orxan",
                "Orxan", "Ramil", "Ilham","Esmira", "Mumu"));

        namess.retainAll(Arrays.asList("Orxan", "Ramil","Ilham"));
        System.out.println(namess);

        System.out.println("===============================================");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7));

        // verify 5, 6, 9, 8 are contained in the list
        boolean result = list.containsAll( Arrays.asList(5, 6, 9, 8, 11 ) ); // false

        System.out.println(     list.containsAll( Arrays.asList(5, 6, 9, 8, 11 ) )      );
        System.out.println( result );


    }
}
