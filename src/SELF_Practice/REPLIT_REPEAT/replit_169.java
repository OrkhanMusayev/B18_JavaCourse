package SELF_Practice.REPLIT_REPEAT;

/**
 * This method gets a string and returns the word count of that string.
 *
 * example:
 *
 * wordCount("foo bar")
 * returns 2
 *
 * wordCount("one two three")
 * returns 3
 *
 * wordCount("bla")
 * returns 1
 */
public class replit_169 {

    public static int wordCount(String words){

        String[] arr = words.split(" ");

        return arr.length;
    }

    public static void main(String[] args) {
        wordCount("foo bar");
    }
}
