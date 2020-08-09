package InterviewCodingTasks;

import java.util.*;

/***
 * Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
 * Write a java operation to remove all the names named Ahmed
 */
public class ArrayList_Remove_Ahmed {

    public static void main(String[] args) {

        ArrayList<String> listOfName = new ArrayList<>(Arrays.asList("Ahmed","Ilham","Ramil","Ahmed"));
        listOfName.removeAll(Arrays.asList("Ahmed"));
        System.out.println(listOfName);


        //Solution 2:

        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        for(ListIterator<String> it = names.listIterator(); it.hasNext();)

            if(it.next().equals("Ahmed"))

                it.remove();

        System.out.println(names);

        //Solution 3:

        List<String> namess = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

                List<String> names2 = new ArrayList<>();

        namess.forEach(p-> {if(p.equals("Ahmed")) names2.add(p);}  );



        System.out.println(names2);



        //Solution 4:

        List<String> namesss = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

                Iterator<String> it = names.iterator();

        while(it.hasNext()) {

            if(it.next().equals("Ahmed"))

                it.remove();

        }

        System.out.println( names );
    }
}
