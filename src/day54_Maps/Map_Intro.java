package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {
    public static void main(String[] args) {

        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put( "Orkhan", 120000.0 ); // similar to add method
        employeeInfo.put("Aisha", 110000.50); // similar to add method

        System.out.println(employeeInfo);
        System.out.println( employeeInfo.size() );

        System.out.println( employeeInfo.get("Orkhan") );
        System.out.println( employeeInfo.get("Aisha") );

        employeeInfo.remove("Aisha"); // delete

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());

        employeeInfo.put("Orkhan", 130000.0);

        System.out.println(employeeInfo);

        System.out.println("==============================================================");


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

    }
}