package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps_Practice1 {

    public static void main(String[] args) {

        Map<String, LocalDate> birthday = new LinkedHashMap<>();
        birthday.put("Venera", LocalDate.of(1980, 12, 29));
        birthday.put("Ramil", LocalDate.of(1981, 9, 15));
        birthday.put("Ilham", LocalDate.of(1985,12,9));
        birthday.put("Solmaz", LocalDate.of(1990, 3, 8));
        birthday.put("Orxan", LocalDate.of(1992,9,15));
        birthday.put("Kenan", LocalDate.of(2020,6,29));

        System.out.println(birthday);
        System.out.println( birthday.size() );

        System.out.println(birthday.get("Ramil"));
        System.out.println(birthday.remove("Ilham"));
        System.out.println( birthday );

        boolean contained = birthday.containsKey("Muhtar");
        System.out.println(contained); // false

        boolean valueContained = birthday.containsValue(LocalDate.of(1992,9,15));
        System.out.println( valueContained ); // true

        birthday.clear(); // remove everything
        System.out.println(birthday);

        System.out.println("============================================================================");

        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Adil",92);
        students.put("Hunar",89);
        students.put("Barzy",75);
        students.put("Rahman",93);
        students.put("Hardi",80);

        LinkedHashMap<String, Integer> badStudents = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goodStudents = new LinkedHashMap<>();

        for( String eachKey   : students.keySet()  ){
            int eachValue = students.get(eachKey);  // score

            if( eachValue < 90){
                badStudents.put(eachKey, eachValue );
            }else{
                goodStudents.put(eachKey, eachValue );
            }
        }


        System.out.println(badStudents);
        System.out.println(goodStudents);



    }
}
