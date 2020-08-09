package InterviewCodingTasks;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Write a method that can return the minimum value from ta map (DO NOT use sort method)
 */
public class Map_MinValue {

    public  static  int  minValue( Map<String,Integer> map  ) {

        SortedSet<Integer> sm = new TreeSet<>(map.values());

        return sm.first( );

    }

    public static void main(String[] args) {

     //   System.out.println("minValue = " + minValue());
    }
}
