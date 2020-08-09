package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setCatInfo("Sasha","Siemes","White",2);
        System.out.println(cat1);

        Cat cat2 = new Cat();
        cat2.setCatInfo("Bobo","Scottish","Beige",7 );
        System.out.println(cat2);


        Cat cat3 = new Cat();
        cat3.setCatInfo("Cinamon","Calico","brow-white",6);
        System.out.println(cat3);


        System.out.println("==========================================================================");



        ArrayList<Cat> catList = new ArrayList<>();
        catList.addAll(Arrays.asList( cat1,cat2,cat3));

        for(int i=0; i<catList.size();i++){
            System.out.println(catList.get(i));
        }

        System.out.println("==========================================================================");
// ACTIONS SLEEPING
        cat1.sleep(); // Sasha
        cat2.sleep(); // Bobo
        cat3.sleep(); // Cinnamon

        System.out.println("==========================================================================");

// ACTIONS EATING

        cat1.eat("cat treats");
        cat2.eat("fish");
        cat3.eat("Sish Kabab");

        System.out.println("==========================================================================");

// ACTIONS DRINKING

        cat1.drink("water");
        cat2.drink("milk");
        cat3.drink("coffee");





    }
}
