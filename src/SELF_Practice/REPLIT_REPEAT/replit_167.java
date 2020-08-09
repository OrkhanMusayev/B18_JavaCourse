package SELF_Practice.REPLIT_REPEAT;

/**
 * uniqueChars is a method that you will code now,
 * should be able to accept any string in the world and return unique characters from the parameter.
 *
 * Examples:
 *
 * uniqueChars("java") ==> "jav"
 *
 * uniqueChars("mama") ==> "ma"
 *
 * uniqueChars("spoon") ==> "spon"
 */
public class replit_167 {

    public static String uniqueChars(String str) {
        //TODO: write your below // java -- > jav

        String unique = "";
        for( int i = 0; i < str.length(); i++){
            if(unique.contains("" + str.charAt(i) ) ){
                continue;
            }
            unique += str.charAt(i);
        }

        return unique;
            }

    public static void main(String[] args) {
        System.out.println(uniqueChars("Java"));
    }
}

