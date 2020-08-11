package Edabit;

/**
 * A string is an almost-palindrome if, by changing only one character, you can make it a palindrome. Create a function that returns true if a string is an almost-palindrome and false otherwise.
 *
 * Examples
 * almostPalindrome("abcdcbg") ➞ true
 * // Transformed to "abcdcba" by changing "g" to "a".
 *
 * almostPalindrome("abccia") ➞ true
 * // Transformed to "abccba" by changing "i" to "b".
 *
 * almostPalindrome("abcdaaa") ➞ false
 * // Can't be transformed to a palindrome in exactly 1 turn.
 *
 * almostPalindrome("1234312") ➞ false
 * Notes
 * Return false if the string is already a palindrome.
 */
public class AlmostPalindrome {

    public static boolean almostPalindrome(String str) {
        int len=str.length(),halfLen=len/2,count=0;
        for(int i=0;i<halfLen;i++)
            if(str.charAt(i)!=str.charAt(len-1-i))
                count++;
        return count==1;
    }

    public static void main(String[] args) {
        System.out.println("almostPalindrome() = " + almostPalindrome("abcdcbg"));
    }
}
