package Ramil;

public class ArrayMissingNum {

    public static void main(String[] args) {
        //Find missing number. input -->> output  5
        //
        int a[]={1,2,3,4,6,7};

        int totalNum;
        totalNum = 7; // 5 include
        int expected_num_sum = totalNum * ((totalNum + 1) / 2); // 28
        int num_sum = 0;
        for (int i: a) {
            num_sum += i; // (1+2+3+4+6+7) = 23
        }
        System.out.print( expected_num_sum - num_sum); // 28-23=5


    }
}
