package SELF_Practice.REPLIT_REPEAT;

import java.util.ArrayList;

/**
 * Given two positive integers m and n, find their greatest common divisor, that is, the largest positive integer that evenly divides both m and n.
 * Example:
 * if m = 15 and n = 25, then result greatest common divisor is = 5.
 */
public class CommonDivisor {

    public static void main(String[] args) {
        System.out.println(commonDivisor(15, 25)); //5
        System.out.println(commonDivisor(40, 124)); //4
        System.out.println(commonDivisor(120, 60)); //60
        System.out.println(commonDivisor(80, 60)); //20
    }


    public static int commonDivisor(int m, int n){
        //WRITE YOUR CODE HERE

        ArrayList<Integer> list=new ArrayList<>();

        if (m>n){
            for (int i=n;i>0;i--){
                if (m%i==0&&n%i==0){

                    list.add(i);

                }
            }

        }
        if (n>m){
            for (int i=m;i>0;i--){
                if (m%i==0&&n%i==0){
                    list.add(i);
                }

            }
        }
        n=list.get(0);
        return n;
    }
}

