package AzeCybertek;

public class solmazPerfectNumbers {

    public static void main (String [] args){

        int perfectNum =28;
        int sum =0;
        for(int i=1; i<perfectNum; i++) {
            if (perfectNum%i==0) {
                sum+=i;
            }
        }
        System.out.println(perfectNum==sum);
    }
}
