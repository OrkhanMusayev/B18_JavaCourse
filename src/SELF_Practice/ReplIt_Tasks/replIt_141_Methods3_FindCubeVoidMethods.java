package SELF_Practice.ReplIt_Tasks;

import java.util.Scanner;

/**
 Given method called cube.
 Write all required code inside this method in order  to asks the user for a number and then prints the cubed value of that number:

Example:

input: 5
output: 125
 */

public class replIt_141_Methods3_FindCubeVoidMethods {

    public static void cube() {
        //your code here

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int cube = n*n*n;
        System.out.println(cube);

    }//end cube

    public static void main(String[] args) {

        cube();

    }
}