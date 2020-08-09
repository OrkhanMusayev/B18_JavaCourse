package day31_BulkOperations;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bulk_ContainsAll {

    public static void main(String[] args) {

        ArrayList<Integer> List1 = new ArrayList<>();
        List1.add(10);
        List1.add(20);
        List1.add(30);
        List1.add(40);

    // if 10, 20, 60,80,90,100,200,4000  if all objects are exits in arraylist ==> true
    // otherwise ==> false

        /*
       boolean r1 = List1.contains(10);
       boolean r2 = List1.contains(20);
       boolean r3 = List1.contains(60);

       boolean result = r1 == true && r2 == true && r3 == true;
        System.out.println(result);

         */

        // Arrays.asList(object1, object2 ..): returns the collection type (List)
        boolean result2 = List1.containsAll(Arrays.asList(10, 20, 60, 80, 90, 100, 200, 4000));
                                           //  CollectionType
        System.out.println(result2); // return false because only 10,20,30,40 we assigned to the list

        // 10, 30, 40

        Integer[] data = {10,30,40};
        boolean result3 = List1.containsAll( Arrays.asList(data) );
        System.out.println( result3 );

        // list1.containsAll( 1,2,3,4,5 );






    }
}
