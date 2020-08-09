package day19_Arrays;

public class Arrays_Practice2 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        System.out.println( arr.length ); // length of arr is 3, this is one way to initialize size

        int[] arr2 = new int[5]; // another way to initialize size
        // in this case without giving value, default value 0 will be initialized to each element [0,0,0,0,0]
        // 0 is default for int, short, byte, long

        System.out.println(arr2[0]);// will print default 0
        System.out.println(arr2[1]); //will print default 0


        String[] Testers = new String[3];  // {"Reem",  "Osman", "Madina"};
        // index:                                 0        1        2
        // String default value is null
        // now we assign values

        Testers[0] = "Reem";
        Testers[1] = "Osman";
        Testers[2] = "Madina";
        System.out.println(Testers[0]);  // Reem
        System.out.println(Testers[1]); //  Madina
        System.out.println(Testers[2]); // "Osman

        System.out.println(Testers.length);  // 3

        System.out.println("========================================");

        String[] students = new String[10];
        // write a program that asks "enter a name" 10 times, and store each of the names in the array students

    }
}
