package Kudrat;

public class AvarageNumArray {
    public static void main(String[] args) {
        int [] arr = {5,5,5};// expected result 5

        int sum=0;
        double avg;

        for(int i=0;i<arr.length;i++){
            sum= arr[i]+sum;
        }

        avg=sum/arr.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
