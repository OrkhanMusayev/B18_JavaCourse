package day29_Wrapper_ArrayList;


public class ParseMethods {

    public static void main(String[] args) {

        String str = "123";

       int a1 =  Integer.parseInt(str); // 123 as int
        System.out.println(str + 1); // String of text
                       // "123" + 1 ==> "1231" returns string (concatenation)
        System.out.println(a1 + 1); // int number
                      //  123 + 1 ==> 124 returns number (addition)

        byte b1 = Byte.parseByte(str); // byte = 123
        System.out.println(b1);

        Integer I1 = (int)Byte.parseByte(str); // AutoBoxing
        // Integer = (int)byte;
        // Integer = int;

        String str2 = "10.5";
        float f1 = Float.parseFloat(str2); // float 10.5
        System.out.println(f1);

        double d1= Double.parseDouble(str2); // double 10.5
        System.out.println(d1);

        String str3 = "3147483647";
        long l1 = Long.parseLong(str3); // 3147483647L
        System.out.println(l1 + 1);

        Long l2 = Long.parseLong(str3);
        System.out.println(l2 + 1);

        String result1 = "true"; // if it's not true or false by default boolean's output is false
        boolean bb1 = Boolean.parseBoolean(result1); // boolean
        System.out.println(bb1); // opposite is false

        String result2 = "fAlSe"; // false
        boolean bb2 = Boolean.parseBoolean(result2); // parse methods not case sensitive
        System.out.println(bb2);







    }
}
