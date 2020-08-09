package AzeCybertek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayListRemove {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));


        Predicate<Integer> pr = p->p>100;
        list1.removeIf(pr);
        list1.removeIf(p->p>100);

        System.out.println(list1);


    }
}
