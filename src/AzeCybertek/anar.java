package AzeCybertek;

import java.util.Arrays;

public class anar {


    public static int[] method(int[] a, int[] b) {
        int c[] = new int[a.length + b.length];
        int z = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                c[z] = a[i];
                ++z;
                c[z] = b[i];
                z++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int a[] = {1, 4, 6, 7, 6, 3, 2};
        int b[] = {1, 4, 6, 7, 6, 3, 2};
        //c[]={1,1,4,4,6,6,7,7,6,6,3,3,2,2}
        System.out.println(Arrays.toString(method(a, b)));



    }
}