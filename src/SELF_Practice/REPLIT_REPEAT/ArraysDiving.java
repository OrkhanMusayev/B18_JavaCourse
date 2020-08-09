package SELF_Practice.REPLIT_REPEAT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.
 * The highest and lowest scores are thrown out, and the remaining scores are added together. The sum is then multiplied by the degree of difficulty for that dive.
 * The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.
 * Use System.out.printf("Total: %.2f",total); in order to get rid of extra floating points.
 * output: Enter score for judge 1:
 * input: 1
 * output: Enter score for judge 2:
 * input: 5
 * output: Enter score for judge 3:
 * input: 5
 * output: Enter score for judge 4:
 * input: 5
 * output: Enter score for judge 5:
 * input: 5
 * output: Enter score for judge 6:
 * input: 8
 * output: Enter score for judge 7:
 * input: 9
 * output: Enter difficulty:
 * input: 2.1
 * output: Total: 35.28
 */
public class ArraysDiving {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter score for judge 1:");
        list.add(input.nextInt());
        System.out.println("Enter score for judge 2:");
        list.add(input.nextInt());

        System.out.println("Enter score for judge 3:");
        list.add(input.nextInt());

        System.out.println("Enter score for judge 3:");
        list.add(input.nextInt());

        System.out.println("Enter score for judge 4:");
        list.add(input.nextInt());

        System.out.println("Enter score for judge 5:");
        list.add(input.nextInt());

        System.out.println("Enter score for judge 6:");
        list.add(input.nextInt());

        System.out.println("Enter score for judge 7:");

        list.add(input.nextInt());
        System.out.println("Enter difficulty:");
        double difficulty = input.nextDouble();

        Collections.sort(list);


        double total = 0;

        for (int i = 1; i < list.size() - 1; i++) {
            total += list.get(i);
        }
        total = total * difficulty;
        total = total * 0.6;
        System.out.printf("Total: %.2f", total);
    }
}

