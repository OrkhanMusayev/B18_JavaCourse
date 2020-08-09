package AzeCybertek;

import java.util.Arrays;

/**
 * int aa[]={1,2,3};
 * int gg[]={4,5,6,7};
 * int hh[]={8,9};
 * int dd[]={10,11};
 */
public class ArraysConcate {

    public static void main(String[] args) {

        int aa[]={1,2,3};
        int gg[]={4,5,6,7};
        int hh[]={8,9};
        int dd[]={10,11};


        int a[]=new int[aa.length+gg.length+hh.length+dd.length];

        for(int i=0,j=0,d=0,w=0;i<a.length;i++){
            if(i<aa.length){
                a[i]=aa[i];
            }else if(j<gg.length){
                a[i]=gg[j++];
            }else if(d<dd.length){
                a[i]=hh[d++];
            }else{
                a[i]=dd[w++];
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
