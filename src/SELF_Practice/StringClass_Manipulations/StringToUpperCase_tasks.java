package SELF_Practice.StringClass_Manipulations;

public class StringToUpperCase_tasks {
        public static void main(String[] args) {
            String N = "cybertek";
            N.toUpperCase();
            System.out.println(N); // cybertek, String is IMMUTABLE
            N = N.toUpperCase();
            System.out.println(N); // CYBERTEK
        }
    }


