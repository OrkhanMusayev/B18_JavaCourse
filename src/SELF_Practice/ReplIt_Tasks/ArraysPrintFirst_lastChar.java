package SELF_Practice.ReplIt_Tasks;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrintFirst_lastChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below


        for(int i = 0; i <= words.length; i++){
        }

        for(String each:words) {
            String str = each.charAt(0) + "" + each.charAt(each.length()-1); // first and last character

            System.out.println(str);

        }

    }
    }

