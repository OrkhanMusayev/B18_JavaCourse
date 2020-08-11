package Edabit;

/**
 * Create a function that takes a number as an argument and returns the square root of that number cubed.
 *
 * Examples
 * cubeSquareRoot (81) ➞ 729
 *
 * cubeSquareRoot (1646089) ➞ 2111932187
 *
 * cubeSquareRoot (695556) ➞ 580093704
 * Notes
 * All numbers will evenly square root, so don't worry about decimal numbers.
 */
public class cubeSquareRoot {

    public static int cubeSquareRoot(int num) {
        return (int) Math.sqrt(num) * num;
    }

    public static void main(String[] args) {

        System.out.println("cubeSquareRoot() = " + cubeSquareRoot(81));
    }
}
