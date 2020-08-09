package Kudrat;

/**
 *how would u remove middle “Java” from the String str below?
 * String str = "JavaJavaJava”;
 *
 */
public class removemMiddle {

    public static void main(String[] args) {


        String str = "JavaJavaJava";

        String result = str.replaceFirst("Java","");
        System.out.println(result);

    }
}