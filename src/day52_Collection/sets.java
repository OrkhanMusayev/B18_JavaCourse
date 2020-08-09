package day52_Collection;

import java.util.*;

public class sets {

    public static void main(String[] args) {
// Set(I): does not accept duplicates. does not have index number, size is dynamic
//          hashset vs linkedhasset:
//          linkedhashset keeps the insertion order as it is
//          hashset is faster than linkedhasset
//set is extended by SortedSet(I): sorted set is implemented by TreeSet
//    TreeSet(C): does not accept duplicates, and sort the objects


        Set<String> names = new LinkedHashSet<>();
        names.add("Sha");
        names.add("Zuura");
        names.add("Saban");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");

        System.out.println(names);

        String[] arr = {"A", "A", "C", "B", "A"}; // ACB
        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList(arr)); // [A,C, B]

        System.out.println(set1);

        //  System.out.println( set1.get(1) );

        System.out.println("=========================================");
        Set<Integer> numbers = new TreeSet<>();
        numbers.addAll( Arrays.asList(10,9,10, 9, 8, 7, 8, 7, 6, 5, 6));

        System.out.println(numbers);

        System.out.println("==========================");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(null);

        System.out.println(hashSet);

        TreeSet<String> treeset = new TreeSet<>();
        treeset.add(null);

        System.out.println(treeset);



    }

}