package SELF_Practice.StringClass_Manipulations;

public class StringConcate_tasks {

    public static void main(String[] args) {

        String s1 = "Cybertek";

        s1.concat(" School"); // attempt to modify String s1
        System.out.println(s1); // String is IMMUTABLE, Cybertek

        s1=s1.concat(" School");
        System.out.println(s1);
    }
}
