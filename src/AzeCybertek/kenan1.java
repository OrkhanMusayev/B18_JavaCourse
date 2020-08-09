package AzeCybertek;

/**
 * Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So “xxcaazz” and “xxbaaz” yields 3, since the “xx”, “aa”, and “az” substrings appear in the same place in both strings.
 * stringMatch(“xxcaazz”, “xxbaaz”) → 3
 * stringMatch(“abc”, “abc”) → 2
 * stringMatch(“abc”, “axc”) → 0
 */
public class kenan1 {

    public  int stringMatch(String a, String b) {
        int counter = 0;
        for (int i = 0; i < (a.length()>b.length()?b.length():a.length()) - 1; i++) {
            if ((a.substring(i, i + 2).equals(b.substring(i, i + 2)))) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
       String   a = "xxcaazz";
       String  b = "xxbaaz";
        int counter = 0;
        for (int i = 0; i < (a.length()>b.length()?b.length():a.length()) - 1; i++) {
            if ((a.substring(i, i + 2).equals(b.substring(i, i + 2)))) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
